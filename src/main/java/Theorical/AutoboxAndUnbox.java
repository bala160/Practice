package Theorical;

public class AutoboxAndUnbox {
    public static void main(String[] args) {

        int i = 127;
        Integer j = i;//autobox
        int a = j;//unbox


        int k = 127;
        Integer l = k;

        System.out.println(j == l);

//        The result of System.out.println(j == l); being true is due to Java's integer caching mechanism. Since 12 is within the cache range, both j and l refer to the same Integer object, leading to == returning true.
//
//        If you used a value outside the cache range (e.g., 200), j == l would likely return false because different Integer objects would be created.
    }
}
