package com.company;

public class Main {

    public static void main(String[] args) {

       int count = 0;
       int sum = 0 ;

        for (int i = 1; i <1000; i++) {
            if ((i % 3 == 0)&& (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);

            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }


}
// System.out.println("10,000 at 2%  interest rate = " + calcInterest(10000.0, 2.0 ));
////        System.out.println("10,000 at 3%  interest rate = " + calcInterest(10000.0, 3.0 ));
////        System.out.println("10,000 at 4%  interest rate = " + calcInterest(10000.0, 4.0 ));
////        System.out.println("10,000 at 5%  interest rate = " + calcInterest(10000.0, 5.0 ));
//
////        for (init; termination; increment) {
////
////        }
//         for (int i=9; 2<=i; i-- ) {
//         System.out.println("10,000 at "+ i+ "%  interest rate = " + calcInterest(10000.0, i ));
//         }
//
//
//         int count = 0;
//         for(int i=10; i< 50; i++) {
//        if(isPrime(i) ) {
//        count++;
//        System.out.println("Number " + i + " is a prime number baby");
//        if (count == 3) {
//        System.out.println("Exiting for loop");
//        break;
//        }
//        }
//        }
//        }
//
//public static double calcInterest(double amount, double interestRate) {
//        return(amount *(interestRate/100));
//        }
//
//public static boolean isPrime(int n) {
//
//        if(n == 1) {
//        return false;
//        }
//
//        for(int i=2; i<= n/2; i++) {
//        if (n % i == 0) {
//        return false;
//        }
//        }
//        return true;