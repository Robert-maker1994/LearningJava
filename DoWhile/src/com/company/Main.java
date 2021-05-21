package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("Skipping Number " + number);
                continue;
            }
            System.out.println("Number = " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }
}




//            int finishNumber = 20;
////            while (number <= finishNumber) {
////                number++ ;
////                if(!isEvenNumber(number)) {
////                    continue;
////                }
////                System.out.println("Even Number " + number);
////            }
////    }
////    public static boolean isEvenNumber(int num) {
////        if ((num % 2) == 0){
////            return true;
////        } else {
////            return false;
////        }
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count is " + count);
//            count++;
//        }
//        do {
//
//            System.out.println("Count val was " + count);
//            count++;
//            if(count > 100) {
//                break;
//            }
//        } while (count != 6);
//  for loop counts to six
//        for (int j = 0; j < 6; j++) {
//            System.out.println("Count for is " + j);
//        }
//        for (int count = 1; count != 6 ; count++) {
//            System.out.println("Count val is " + count);
//        }

