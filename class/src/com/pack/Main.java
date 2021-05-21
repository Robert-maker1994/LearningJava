package com.pack;

public class Main {




    public static void main(String[] args) {
//        Bank myBank = new Bank(
//                23445,
//                300,
//                "Rob@gmail.com",
//                "Robert"
//        );
//        myBank.getEmail();
//        myBank.deposit(100);
//        myBank.withdrawal(50);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("jon", 2005.4);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 1.1, "Tim@gmail.com");
        System.out.println(person3.getEmailAddress());


    }
}
