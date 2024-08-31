package org.example;

import java.util.Hashtable;

public class HashTableProgram {

    /**
     *
     * A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
     * Java Hashtable class contains unique elements.
     * Java Hashtable class doesn't allow null key or value.
     * Java Hashtable class is synchronized.
     * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
     * @param args
     */
    public static void main(String[] args){
        Hashtable<Integer,String> map = new Hashtable<>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(105, "Not Found"));
    }
}
