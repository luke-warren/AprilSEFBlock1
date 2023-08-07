package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CatalogWithArrayList {
    private String storeName;
    private int inventoryTotal;

    //Item -> Prices
    private HashMap<String, ArrayList<Double>> items;

    public CatalogWithArrayList(String storeName){
        this.storeName = storeName;
        this.inventoryTotal = 0;
        this.items = new HashMap<>();
    }

    public CatalogWithArrayList(String storeName, HashMap<String,ArrayList<Double>> items){
        this.storeName = storeName;
        this.items = items;
        this.inventoryTotal = this.items.size(); //TODO: Talk more
    }

    public HashMap<String, ArrayList<Double>> getItems(){
        return this.items;
    }

    public ArrayList<Double> getPriceOfItem(String item){
        return items.get(item);
    }

    public Double getFirstPriceOfItem(String item){
        return items.get(item).get(0);
    }

    public Double getLastItemPrice(String item){
        ArrayList<Double> prices = items.get(item);
        return prices.get(prices.size()-1);
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
            Double currentPrice = this.items.get(key).get(0);
            if(currentPrice > highestPrice){
                highestPrice = currentPrice;
                itemName = key;
            }
        }

        return itemName + ", price: $" + highestPrice;
    }

    public ArrayList<String> getAllItemNamesBelow30(){
        ArrayList<String> itemNames = new ArrayList<>();
        for(Map.Entry<String, ArrayList<Double>> entry : this.items.entrySet()){
            if(entry.getValue().get(0) < 30.0){
                itemNames.add(entry.getKey());
            }
        }
        return itemNames;

    }

    public void updatePrice(String itemName, Double newPrice){
        ArrayList<Double> oldPrices = this.items.get(itemName);
        oldPrices.add((newPrice));
        this.items.replace(itemName, oldPrices);
    }


    public int getInventoryTotal() {
        return inventoryTotal;
    }
}
