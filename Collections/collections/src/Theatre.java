import java.util.ArrayList;
import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean resreveSeat(String seatNumber) {
        //Seat requestSeat = null; This is the old code, before we implement the seat code.
        // Below is creating a new seat every search
        Seat requestSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();

        } else {
            System.out.println("there is no seat " + seatNumber);
            return false;
        }

    }

    // This is our old search of before the binary search.
    //        for (Seat seat : seats) {
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                break;
//            }
//        }
//        if (requestSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//        }
//        return requestSeat.reserve();


    //For testing
    public Collection<Seat>  getSeats() {
        return seats;

        // Old code for getting seats
        //for (Seat seat : seats) {
         //   System.out.println(seat.getSeatNumber());

    }

    private class Seat implements  Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }
//     Using Comparable from the collection frame work you
        // Implement a binary tree.
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public double getPrice() {
            return price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
