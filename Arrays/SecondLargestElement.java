import java.util.*;
public class SecondLargestElement {

    public int secondLargest(int arr[], int n){
        int largest = arr[0];
        int sLargest = -1;
        for(int i = 1; i<n; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] <= largest && arr[i]>sLargest){
                sLargest = arr[i];
            }
        }

        return sLargest;
    }
    public int secondSmallest(int arr[], int n){
        int smallest = arr[0];
        int sSmallest = 10000; //Any Big Number
        for(int i = 1; i<n; i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest= arr[i];
            }else if(arr[i] != smallest && arr[i]<sSmallest){
                sSmallest = arr[i];
            }
        }

        return sSmallest;
    }

    public static void main(String[] args) {
        SecondLargestElement second = new SecondLargestElement();
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

        //Print Second Largest Element
        System.out.println("\nThe Second Largest Element of this array is "+second.secondLargest(arr, n));
        
        //Print Second Smallest Element
        System.out.println("The Second Smallest Element of this array is "+second.secondSmallest(arr, n));


    }
}
