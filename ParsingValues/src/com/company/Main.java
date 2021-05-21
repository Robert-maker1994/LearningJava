package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.124";
        System.out.println("number As String =" + numberAsString);
            // Parsing a string to an int
        //int number = Integer.parseInt(numberAsString);

        // Parsing a Double method
        double number = Double.parseDouble(numberAsString);
        System.out.println("double number = "  + number);

        numberAsString += 1;
        number += 1;

        System.out.println(number +" " + numberAsString);
    }
}
