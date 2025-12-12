import java.util.Scanner;

public class LinearSearch {
    public int linearSearch(int arr[], int n, int key){
        for(int i = 0; i<n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch lSearch = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //Input Array
        for(int i = 0; i<n; i++){
            System.out.print("Enter Element "+i+": ");
            arr[i] = sc.nextInt();
        }

        //Print Array
        System.out.println("Array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        int foundKey = lSearch.linearSearch(arr, n, 5);
        System.out.println("\nElement found at index "+foundKey);
        
    }
}
