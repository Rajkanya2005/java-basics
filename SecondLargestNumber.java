import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask for array size
        System.out.println("enter the numbers of element: ");
        int n=sc.nextInt();

        //declare array
        int[]arr=new int[n];

        //input element
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //find largest and secont largest
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest&& num!=largest){
                secondLargest=num;
            }
        }
        System.out.println("Second Largest Number"+secondLargest);
          sc.close();
    }
}
