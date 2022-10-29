package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    //abstract - title, discSize, discType, yearReleased
    private String title;
    private int discSize;
    private String discType;
    private String yearReleased;
    private ArrayList<String> contents = new ArrayList<>();


    public BaseDisc(String title, int discSize, String discType, String yearReleased){
        this.title = title;
        this.discSize = discSize;
        this.discType = discType;
        this.yearReleased = yearReleased;
    }

    public String getDiscInfo(){
        return "Title: " + this.title + "Year: " + this.yearReleased;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDiscSize() {
        return discSize;
    }

    public void setDiscSize(int discSize) {
        this.discSize = discSize;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }
}
