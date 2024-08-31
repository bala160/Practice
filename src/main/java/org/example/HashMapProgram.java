package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {


    /**
     * • Java HashMap contains values based on the key.
     * • Java HashMap contains only unique keys.
     * • Java HashMap may have one null key and multiple null values.
     * • Java HashMap is non synchronized.
     * • Java HashMap maintains no order.
     * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
     *
     * @param args
     */
    public static void main(String[] args) {

        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "Bala");
        data.put(2, "Priya");

        // for(Map.Entry m : data.entrySet())
        //   System.out.println(m);

        //No Duplicate Key on HashMap
        HashMap<Integer, String> sample1 = new HashMap<>();
        sample1.put(1, "Suchi");
        sample1.put(2, "Priya");
        sample1.put(1, "Bala");
        for (Map.Entry m : sample1.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        sample1.putIfAbsent(3, "AAnchal");
        for (Map.Entry m : sample1.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());


        HashMap<Integer, String> map = new HashMap<>();
        map.put(104, "Ravi");
        map.putAll(sample1);

        for (Map.Entry m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

    }
}
