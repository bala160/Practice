package LogicalProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class RearrangeElements {
    public static void main(String[] args) {

        int[] num = {6, 6, 3, 2, 7, 3, 1, 0, -1};
        int temp;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] > num[j]) { // j : small num , i : large number
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int res : num)
            System.out.println(res);
    }
}
