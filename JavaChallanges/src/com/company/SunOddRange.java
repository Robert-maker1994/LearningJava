package com.company;

public class SunOddRange {
    public static void main(String[] args) {

        sumOdd(13 , 13);
    }
    public static boolean isOdd(int number ) {

        if((number %2)==0){
            return false;
        } else if (number < 0) {
            System.out.printf("Invalid number ");
            return false;
        } else {
            System.out.printf("number %d is odd number %n", number);

            return true;
        }
    }
    public static int sumOdd (int start, int end) {

        int sum = 0;
        for (int i = start; i <= end ; i++) {
               if (isOdd(i)) {
                   sum += i;

               } else if (i >= end) {
                   System.out.println("-1");
                    return -1;
               }
        }
        System.out.println(sum);
        return sum ;
    }
}
