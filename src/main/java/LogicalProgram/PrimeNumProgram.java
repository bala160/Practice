package LogicalProgram;

public class PrimeNumProgram {
    public static void main(String[] args) {
        int num = 3, i = 2;
        boolean prime = true;
        while (i < num) {
            if (num % i == 0)
                System.out.println("It is not prime number");
            prime = false;
            i = i + 1;
            if(prime == true){
                System.out.println("It is prime number");
            }
        }
    }
}

