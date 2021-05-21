package com.company;

public class Main {

   public static void main(String[] args) {
//	int value = 1;
//	if (value ==1 ) {
//        System.out.println("Value was 1");
//	} else if (value == 2) {
//        System.out.println("Value was 2");
//    } else {
//        System.out.println("System wasn't either");
//    }
	 char switchValue = 'A';

	switch (switchValue) {
        case 'A':
            System.out.println("Value was A");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was 3,4,5");
            break;
        default:
            System.out.println("was not 1 or 2");
            break;

    }
    }
}
