import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: "); 
        int rows=sc.nextInt();
        
        
        for(int i=1; i<=rows;i++){
            
            //print spaces
            for(int j=1;j<=rows-1;j++){
                System.out.print(" ");
            }
            // print numbers
            for(int j=1; j<=i;j++){
                System.out.print(i+" ");
            }
             System.out.println( ); //next line
        }
        sc.close();
    }
}
