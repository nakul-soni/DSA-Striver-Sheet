import java.util.*;
public class InsertionSort {
    public void insertionSort(int arr[], int n){
        for(int i = 0; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        InsertionSort in = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        //Input Array
        for(int i = 0; i<n; i++){
            System.out.print("Enter Element"+i+": ");
            arr[i] = sc.nextInt();
        }
        
        //Print Array(Unsorted)
        System.out.println("\nUnsorted Array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        //Print Array(Sorted)
        System.out.println("\nSorted Array: ");
        for(int i = 0; i<n; i++){
            in.insertionSort(arr,n);
            System.out.print(arr[i]+" ");
        }
    }
}
