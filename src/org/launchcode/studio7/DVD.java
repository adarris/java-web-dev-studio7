package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String title, int discSize, String discType, String yearReleased){
        super(title, discSize, discType, yearReleased);
    }
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 32,000 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Click play for the best movie of this year.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
