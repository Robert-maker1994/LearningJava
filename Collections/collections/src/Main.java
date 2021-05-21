import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Vue", 8 , 12);

        if(theatre.resreveSeat("H04")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seeat is taken");
        }
    }
}
