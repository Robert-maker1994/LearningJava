package com.mapchallange;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, user  > users = new HashMap<Integer, user>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        users.put(1, new user( 785028828 ,"Karan"));
        users.put(2, new user( 234345423 ,"Laura"));
        users.put(3, new user( 667535332 ,"Jim"));
        users.put(4, new user( 665435334 ,"John"));
        users.put(5, new user( 668970531 ,"Luke"));

        System.out.println("Users");
        for (HashMap nam : user) {
            System.out.println("\t" + nam.getName());
        }


//       // System.out.println(users.keySet());
//        int loc = 1;
//        while(true) {
//            System.out.println(users.get(loc));
//            if (loc == 0) {
//                break;
//            }
//           Map<String, Integer> exits = users.get(loc).getExits();
//            System.out.print("What user would you like to select ");
//            for(String exit: exits.keySet()) {
//                System.out.print(exit.hashCode());
//            }
//            scanner.nextLine();
//           String userSelection = scanner.nextLine();
//


//            Map<String, Integer> exits = locations.get(loc).getExits();
//            System.out.print("Available exits are ");
//            for(String exit: exits.keySet()) {
//                System.out.print(exit + ", ");
//            }
//            System.out.println();
//
//            String direction = scanner.nextLine().toUpperCase();
//
//            if(exits.containsKey(direction)) {
//                loc = exits.get(direction);
//
//            } else {
//                System.out.println("You cannot go in that direction");
//            }
//        }
        }
    }

