package org.example;

public class Car implements Example, Movable{
    private String color;
    private String makeModelYear;
    private boolean fourWheelDrive;
    private double cost;


    @Override
    public void match(String matchingObject){
        System.out.println(color.equals(matchingObject));

    }

    @Override
    public double getValue(){
        return cost;

    }

    @Override
    public void move(){
        System.out.println("Vrooom");
    }
}
