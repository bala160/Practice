package Aggregation;

public class mainFunction {
    String desigination;
    AggregationClass data;
    public mainFunction(String desigination,AggregationClass data){
        this.data = data;
        this.desigination = desigination;
    }

    void display(){
        System.out.println(desigination);
        System.out.println(data.name+" "+data.salary);
    }

    public static void main(String[] args){
        AggregationClass c = new AggregationClass(50000,"Bala");

        mainFunction e = new mainFunction("Java Developer",c);
        e.display();

    }
}
