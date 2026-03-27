import java.util.Scanner;
public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter your number :");
         int num =sc.nextInt();
         int reverse=0;
         
         while(num!=0){
          int digit=num%10;  // we get last num
          reverse = reverse*10 +digit;
          num=num/10;  //remove last digit
         }
        System.out.println("Reversed number is: "+reverse);
        sc.close();
    }
}
