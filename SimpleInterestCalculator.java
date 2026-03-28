import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
    System.out.println("Enter principal: ");   // take input
    double principal=sc.nextDouble();
    
    System.out.println("Enter rate: "); 
    double rate=sc.nextDouble();

    System.out.println("Enter first time: "); 
    double time=sc.nextDouble();

    //Calculate simple interest
    double simpleinterest=(principal+rate*time)%100;

    //output
    System.out.println("Simple Interest ="+ simpleinterest);
    sc.close();   
}
}
