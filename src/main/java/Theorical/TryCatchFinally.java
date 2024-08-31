package Theorical;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            TryCatchFinally a = new TryCatchFinally();

            System.out.println(a.method());
            System.exit(0);//if this line exists finally will not work
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("HI");
        }
    }

    public String method() {
        return "success";
    }
}
