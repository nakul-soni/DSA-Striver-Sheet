import java.util.*;
class SelectionSort{

    public void selectionSort(int arr[], int n){
        for(int i = 0; i<=n-2; i++){
            int min = i;
            for(int j = i; j<=n-1; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
        }
    }
    public static void main(String[] args){
        SelectionSort s = new SelectionSort();

        System.out.print("Enter the size of Array: " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Array Input
        for(int i = 0; i<=n-1; i++){
            System.out.print("Enter Element "+i+": ");
            arr[i] = sc.nextInt();
        }

        //Array Print(UnSorted)
        System.out.println("Unsorted Array: ");

        for(int i = 0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }

        //Array Print(Sorted)
        System.out.println("\nSorted Array: ");
        for(int i = 0; i<=n-1; i++){
            s.selectionSort(arr, n);
            System.out.print(arr[i]+" ");
        }
        
        
    }
}