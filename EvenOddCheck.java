import java.util.Scanner;
public class EvenOddCheck {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");  
     int a=sc.nextInt();
      
     if(a%2==0){
        System.out.println(a+"Number is Even");
      }
        else{
            System.out.println(a+"number is Odd");
        }
        sc.close();
        
    }
}
