package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String title, int discSize, String discType, String yearReleased){
        super(title, discSize, discType, yearReleased);
    }

    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 23,000 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to play listen to something amazing?");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
