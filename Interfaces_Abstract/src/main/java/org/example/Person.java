package org.example;

public class Person implements Example{
    private String name;
    private double age;
    private String address;



    public void walk(){
        System.out.println("Do some walking");
    }

    @Override
    public void match(String matchingObject){
        String otherName = matchingObject;
        System.out.println(this.name.equals(otherName));
    }

    @Override
    public double getValue(){
        return age;

    }


}
