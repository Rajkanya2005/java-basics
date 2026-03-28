import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: "); 
        int rows=sc.nextInt();
        
        //outer loop for rows
        for(int i=1; i<=rows;i++){
            
            //input loop for stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //move to next line
             System.out.println( );
        }
        sc.close();
    }
}
