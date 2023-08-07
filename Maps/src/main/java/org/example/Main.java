package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

        for(Map.Entry<String,String> entry : dictionary.entrySet()){
            String key = entry.getKey();
            System.out.println(key);
            String value = (String) entry.getValue();
            System.out.println(value);
        }

        for (String value : dictionary.values()){
            System.out.println(value);
        }



    }
}