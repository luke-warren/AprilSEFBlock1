package org.example;

public class PatagoniaBackpack {
    private Integer pockets;
    private String color;

    private Integer zippers;
    private Integer buckles;
    private String size;

    public static String producer = "Patagonia";

    public PatagoniaBackpack(Integer pockets, String color, Integer zippers, Integer buckles, String size) {
        this.pockets = pockets;
        this.color = color;
        this.zippers = zippers;
        this.buckles = buckles;
        this.size = size;
    }

    public static String getProducer() {
        return producer;
    }



    public Integer getPockets() {
        return pockets;
    }

    public String getColor() {
        return color;
    }

    public Integer getZippers() {
        return zippers;
    }

    public Integer getBuckles() {
        return buckles;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString(){
        return "Color: " + this.color + ",  Producer: " + producer + " Pockets: " + this.pockets + ", Buckles: " + this.buckles + ", Size: " + this.size + ", Zippers: " + this.zippers;
    }
}
