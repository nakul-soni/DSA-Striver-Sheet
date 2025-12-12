import java.util.*;
public class BubbleSort {

    public void bubbleSort(int arr[], int n){
        int didSwap = 0;
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                System.out.println("\nArray is already Sorted.");
                break;
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Array Input
        for(int i = 0; i<=n-1; i++){
            System.out.print("Enter Element"+i+": ");
            arr[i] = sc.nextInt();
        }

        //Array Print(Unsorted)
        System.out.println("Unsorted Array: ");
        for(int i = 0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
        //Array Print(Sorted)
        System.out.println("\nSorted Array: ");
        b.bubbleSort(arr, n);
        for(int i = 0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
