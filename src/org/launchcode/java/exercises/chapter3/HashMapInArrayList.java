package org.launchcode.java.exercises.chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapInArrayList {
    public static void main(String[] args) {
       ArrayList<HashMap<String,String>> listmappy = new ArrayList<>();
       HashMap<String,String> justmap = new HashMap<String,String>();

       justmap.put("hashmap 1", "mappy1");
       justmap.put("hashmap 2", "mappy2");
       justmap.put("hashmap 3", "mappy3");

       listmappy.add(justmap);
       System.out.println(listmappy);

       for(HashMap<String,String> map : listmappy) {

           for(Map.Entry<String,String> keyvaluepair : map.entrySet()) {
               System.out.println("***** \nkey: " + keyvaluepair.getKey() + " value: " + keyvaluepair.getValue() + "\n*****\n");
           }

       }

    }
}
