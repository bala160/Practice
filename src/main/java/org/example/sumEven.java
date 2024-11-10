package org.example;

import java.util.Arrays;

public class sumEven {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int nos : num) {
            if (nos % 2 == 0) {
                sum += nos;
            }
        }

        System.out.println(sum);
    }
}
