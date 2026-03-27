import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a=sc.nextInt();
        int count=0;
        
        if(a<=1){
            System.out.println(a+"is not a prime number");
        }

        else{

            for(int i=2; i<=a/2;i++){
                if(a%i==0){
                    count++;
                    break;
                }
            }
                if(count==0){
                    System.out.println(a+"is a prime number");
                }
                else{
                    System.out.println(a+"is not a prime number");
                }
            }
        
       sc.close();
    }
}