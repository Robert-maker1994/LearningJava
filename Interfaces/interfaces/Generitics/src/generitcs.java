import java.util.ArrayList;

public class generitcs {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseBall pat = new BaseBall("pat");
        SoccerPlayer messi = new SoccerPlayer("messi");

        Team<FootballPlayer> newcastle = new Team<>("Newcastle united");
        newcastle.addPlayer(joe);


        System.out.println(newcastle.numPlayers());

//You can add any class to the parameter T. Incept primative types
        Team<BaseBall> baseBallTeam = new Team<>("Chicago Cubs");
        baseBallTeam.addPlayer(pat);


    }

}




    // Genertics allow us to create classes in the face of
// methods that take types of parameters called unsurprisingly type
// type paramaters?

              //This is a raw type of Array list
//            ArrayList items = new ArrayList();
//            items.add(1);
//            items.add(2);
//            items.add(3);
//            items.add(4);
//            items.add(5);
//
//            printDoubled(items);
//
//        }
//
//
//        private  static void printDoubled(ArrayList n) {
//            for(Object i : n) {
//                System.out.println((Integer) i * 2);
//            }
//        }

    // This is creating it using genertics
    // genetic use <Integer>
    //
//
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
//
//    }
//
//
//    private  static void printDoubled(ArrayList<Integer> n) {
//        for(Object i : n) {
//            System.out.println((Integer) i * 2);
//        }
//    }



