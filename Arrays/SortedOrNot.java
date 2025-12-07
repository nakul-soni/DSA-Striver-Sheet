import java.util.*;
public class SortedOrNot {
    public boolean isSorted(int arr[], int n){
        for(int i = 0; i<n-1; i++){
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SortedOrNot checksort = new SortedOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
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

        //Check if Sorted or not
        if (checksort.isSorted(arr, n)) {
            System.out.println("\nThe Array is Sorted!");
        }else{
            System.out.println("\nThe Array is not Sorted!");
        }




    }
}
