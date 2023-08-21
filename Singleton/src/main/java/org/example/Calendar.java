package org.example;

public class Calendar {
    //Private constructor
    // Store the singleton instance
    // Some way to get the instance

    private static final Calendar instance = new Calendar();

    private Calendar(){}

    public static Calendar getInstance(){
        return instance;
    }
}
