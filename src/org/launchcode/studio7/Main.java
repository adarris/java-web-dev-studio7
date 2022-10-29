package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD myCD = new CD("RENNAISSANCE", 120, "CD", "2022");
        DVD myDVD = new DVD("Woman King", 2400, "DVD", "2022");
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myDVD.spinDisc();
        myCD.spinDisc();

        myCD.readData();
        myDVD.readData();
    }
}

