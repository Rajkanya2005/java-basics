import java.util.Scanner;
public class SumofTwoNumber{
   public static void main (String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter 1st number:");
      int a=sc.nextInt();
      
      System.out.print("Enter 2nd number:");
      int b=sc.nextInt();
      
      int sum=a+b;
      System.out.print("Sum:"+sum);
      sc.close();
   } 
}