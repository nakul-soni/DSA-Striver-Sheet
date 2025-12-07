import java.util.*;

public class LargestElement {
    public int largestNumber(int arr[], int n){
        int largest = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        LargestElement large = new LargestElement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //Array Input
        for(int i = 0; i<n; i++){
            System.out.print("Enter Element "+i+": ");
            arr[i] = sc.nextInt();
        }

        //Print Array
        System.out.println("Array: " ); 
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        //Print Largest Element
        System.out.println("\nLargest Element of the Array is "+large.largestNumber(arr,n));


    }
}
