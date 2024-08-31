package org.example;

import java.util.TreeMap;

public class TreeMapProgram
{
    /**
     * Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
     * Java TreeMap contains only unique elements.
     * Java TreeMap cannot have a null key but can have multiple null values.
     * Java TreeMap is non synchronized.
     * Java TreeMap maintains ascending order.
     * @param args
     */
    public static void main(String[] args){

        TreeMap<Integer,String> data = new TreeMap<>();
        data.put(1,"Apple");
        data.put(2,"Orange");
        data.put(null,"Apple");
    }
}
