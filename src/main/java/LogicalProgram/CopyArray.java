package LogicalProgram;

public class CopyArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        //int[] copy = arr.clone();
        int[] copy = new int[10];
        for(int i = 0;i< arr.length;i++){
            copy[i] = arr[i];
            System.out.println(copy[i]);
        }
    }
}
