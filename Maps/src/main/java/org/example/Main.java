package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String>  dictionary = new HashMap<>();
        dictionary.put("MSI", "Magic Space Iguana");
        dictionary.put("Jean Ralphio", "Character in the sitcom Parks and Rec");
        dictionary.put("Alaska", "49th territory to become a state");

//        System.out.println(dictionary.containsKey("alaska"));
//        System.out.println(dictionary.get("Alaska"));

        HashMap<Integer, String> stateEntries = new HashMap<>();
        stateEntries.put(1, "Delaware");
        stateEntries.put(50, "Hawaii");
        //Remove
        //Replace
        //Keys Values Entries

        //dictionary.remove("Alaska");
        String oldValue = dictionary.replace("Jean Ralphio", "Played by Ben Schwartz");
        boolean didReplace = dictionary.replace("Jean Ralphio", "Played by Ben Schwartz", "Played by Ben Schwarz");
//        System.out.println(oldValue);
//        System.out.println(didReplace);
//        System.out.println(dictionary.get("Jean Ralphio"));

//        for(Map.Entry<String,String> entry : dictionary.entrySet()){
//            String key = entry.getKey();
//            System.out.println(key);
//            String value = (String) entry.getValue();
//            System.out.println(value);
//        }
//
//        for (String value : dictionary.values()){
//            System.out.println(value);
//        }


//        Dog dog = new Dog();
//        dog.age = 3;
//        dog.name = "Clifford";
//
//        //Dog sameDog = dog;
//        Dog sameDog = new Dog();
//        sameDog.age = 3;
//        sameDog.name = "Clifford";
//
//        System.out.println(dog.name + ", " + dog.age);
//        System.out.println(sameDog.name + ", " + sameDog.age);
//        System.out.println(dog);
//        System.out.println(sameDog);
//        System.out.println(dog == dog);
//        System.out.println(dog.equals(dog));

        Catalog catalog = new Catalog("Kenzie Store");

        Scanner scanner = new Scanner(System.in);
        boolean continueToAddItems = true;
        while(continueToAddItems){
            System.out.println("Item Name?");
            String itemName = scanner.nextLine();
            System.out.println("Price?");
            String price = scanner.nextLine();
            System.out.println("Serial Number?");
            String serial = scanner.nextLine();

            Item item = new Item(itemName, Double.parseDouble(price), serial);
            catalog.addNewInventoryItem(item);
            Item itemA = new Item(itemName, 3.0, serial);
            System.out.println(catalog.addNewInventoryItem(itemA));



            System.out.println("Add more items? (Enter Y/N)");
            String reply = scanner.nextLine();
            if(reply.equalsIgnoreCase("N")){
                continueToAddItems = false;
            }
        }




    }
}