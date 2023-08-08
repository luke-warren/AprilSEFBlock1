package org.example;

import java.util.Objects;

public class Item {
    private String itemName;
    private double price;
    private String serialID;

    public Item(String itemName, double price, String serialID) {
        this.itemName = itemName;
        this.price = price;
        this.serialID = serialID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemName, item.itemName) && Objects.equals(serialID, item.serialID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, serialID);
    }
}
