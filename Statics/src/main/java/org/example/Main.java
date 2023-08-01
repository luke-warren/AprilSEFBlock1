package org.example;


import static org.example.Directions.NORTH;
import static org.example.Directions.*;


public class Main {
    public static void main(String[] args) {
        PatagoniaBackpack blueBackPack = new PatagoniaBackpack(3, "blue", 2, 1, "Medium");

        PatagoniaBackpack redBackPack = new OutdoorPatagoniaBackPack(3, "red", 2, 1, "Medium", 3, 4);

        String direction = S.getDirection();


        System.out.println(PatagoniaBackpack.getProducer());
        System.out.println(blueBackPack);
        System.out.println(redBackPack);
    }
}