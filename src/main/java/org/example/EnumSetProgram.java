package org.example;

import java.util.EnumSet;
import java.util.Set;
 enum days{
    Bala,Priya,Suchitra
}
public class EnumSetProgram {

    /**
     *
     * Java EnumSet class is the specialized Set implementation for use with enum types.
     * It inherits AbstractSet class and implements the Set interface
     */

    public static void main(String[] args){

        Set<days> s = EnumSet.of(days.Bala);
        System.out.println(s);

        Set<days> s1 = EnumSet.allOf(days.class);
        System.out.println(s1);
    }
}
