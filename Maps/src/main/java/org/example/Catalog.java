package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private String storeName;
    private int inventoryTotal;

    //Item -> Prices
    private HashMap<String,Double> items;

    public Catalog(String storeName){
        this.storeName = storeName;
        this.inventoryTotal = 0;
        this.items = new HashMap<>();
    }

    public Catalog(String storeName, HashMap<String,Double> items){
        this.storeName = storeName;
        this.items = items;
        this.inventoryTotal = this.items.size(); //TODO: Talk more
    }

    public HashMap<String, Double> getItems(){
        return this.items;
    }

    public Double getPriceOfItem(String item){
        return items.get(item);
    }



    //"Pillows" ->  10.00
    //"Plates" -> 30
    //Couch ->  450.75


    // loop over each entry/keys  +
    // keep track of the highest price - variable
    // compare current price to the highest
    // if current price is larger -> update highest price
    // Store the item name of highest price
    public String getMostExpensiveItem(){
        Double highestPrice = 0.0;
        String itemName = "";
        for(String key : this.items.keySet()){
            Double currentPrice = this.items.get(key);
            if(currentPrice > highestPrice){
                highestPrice = currentPrice;
                itemName = key;
            }
        }

        return itemName + ", price: $" + highestPrice;
    }

    public ArrayList<String> getAllItemNamesBelow30(){
        ArrayList<String> itemNames = new ArrayList<>();
        for(Map.Entry<String, Double> entry : this.items.entrySet()){
            if(entry.getValue() < 30.0){
                itemNames.add(entry.getKey());
            }
        }
        return itemNames;

    }

    public boolean updatePrice(String itemName, Double newPrice){
        Double oldPrice = this.items.get(itemName);
        return this.items.replace(itemName, oldPrice, newPrice);
    }


    public int getInventoryTotal() {
        return inventoryTotal;
    }
}
