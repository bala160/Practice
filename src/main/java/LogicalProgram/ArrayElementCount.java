package LogicalProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayElementCount {
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3, 1, 4, 5, 3, 6};
        int count = 0;
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < copyArr.length; j++) {
                if (arr[j] == arr[i]) {

                    System.out.println("Duplicate element" + " " + arr[j]+ "Count"+ count);
                }
                count++;

            }
        }*/

        int[] nums = { 1, 20, 2, 3, 1, 2, 3, 2, 221, 20 };

        Map<Integer, Long> dups = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");

        for(Map.Entry m : dups.entrySet())
            System.out.println("    " + m.getKey() + "    |    " + m.getValue());
        System.out.println("----------------------------------------");
    }
}
