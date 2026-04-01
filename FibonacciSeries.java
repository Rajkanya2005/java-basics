import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n=sc.nextInt();
        int first=0 ,second =1;

        System.out.println(" Fibonacci Series: ");
        for(int i=0;i<n;i++){
            System.out.println(first +" ");
            int next=first +second;  // Calculate next number
            first=second;  //update values
            second=next;
        }
        sc.close();
    }
}
