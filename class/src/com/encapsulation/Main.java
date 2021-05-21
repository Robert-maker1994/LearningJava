package com.encapsulation;

public class Main {

    public static void main(String[] args) {

//        // By making our field private you make enapsulation.
//            EnhancedPlayer player = new EnhancedPlayer("rob", 50, "Sword");
//        System.out.println("Initial health is " + player.getHealth());

            Printer printer = new Printer(50, true);

        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(6);
        System.out.println(pagesPrinted + printer.getPagesPrinted());
    }
}
