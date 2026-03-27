import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number: ");   
      int a= sc.nextInt();
      
      if(a<0){
        System.out.println(a+"factorial is not defined");
      }
      else{ 
         long fact=1;

         for(int i=1; i <=a;i++){
            fact=fact*i;
      }
       System.out.println(fact+" is the factorial of "+a);
     
    }
     sc.close();
    }
}
