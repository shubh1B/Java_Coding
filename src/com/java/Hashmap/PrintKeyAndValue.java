package com.java.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class PrintKeyAndValue {
    public static void main(String[] args) {

        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("mango",90);
        fruits.put("Banana",50);
        fruits.put("apple",70);
//        System.out.println(fruits.get("mango"));//90
//        System.out.println(fruits.values());//70,90,50
//        System.out.println(fruits.keySet());//apple,mango,banana
//        System.out.println(fruits.entrySet());//apple=70, mango=90, Banana=50]
        for(Map.Entry<String,Integer>entry:fruits.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());

        }

        System.out.println(fruits.containsKey("mango"));
        fruits.replace("mango",40);//[apple=70, mango=40, Banana=50]
        System.out.println(fruits.entrySet());
        fruits.remove("mango");
        System.out.println(fruits.entrySet());
        fruits.remove("apple",70);
        System.out.println(fruits.entrySet());
        for(String key:fruits.keySet()){
            System.out.println(key);
            System.out.println(fruits.get(key));
        }


    }
}
