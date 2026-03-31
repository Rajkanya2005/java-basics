import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input size
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //input array
        System.out.println("enter the element: ");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to search: ");
         int target=sc.nextInt();
         int index=-1;

           //linear search logic
           for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
           }

           if(index!=-1){
            System.out.println("Element found at index: "+index);

           }
           else{
            System.out.println("Element not found");
           }
         sc.close();
    }
}
