package org.example;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

enum days1{
    mon,tue,sun
}
public class EnumMapProgram {

    /**
     *
     * Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
     *
     */
public static void main(String[] args){
    EnumMap<days1,String> s = new EnumMap<days1, String>(days1.class);
    s.put(days1.mon,"1");
    s.put(days1.tue,"2");

    for(Map.Entry res : s.entrySet())
        System.out.println(res);
}



}
