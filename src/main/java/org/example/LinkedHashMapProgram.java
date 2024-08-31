package org.example;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {
    /**
     * Java LinkedHashMap contains values based on the key.
     * Java LinkedHashMap contains unique elements.
     * Java LinkedHashMap may have one null key and multiple null values.
     * Java LinkedHashMap is non synchronized.
     * Java LinkedHashMap maintains insertion order.
     * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
     * @param args
     */
    public static void main(String[] args){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}
