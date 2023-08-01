package org.example;

public enum Directions {
    NORTH("North"),
    S("South"),
    E("East"),
    W("West");


    final String direction;
    Directions(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
