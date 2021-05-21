package com.company;

public class DeskPhone  implements telephone {
// In order to but a valid class
    private int  myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No Action take, desk phone does not have apower button");
    }

    @Override
    public void dial(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring ");
        } else {
            isRinging = false;
        }
    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
