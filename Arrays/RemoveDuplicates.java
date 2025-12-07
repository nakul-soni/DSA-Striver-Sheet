import java.util.*;
public class RemoveDuplicates {
    public int removeDuplicates(int arr[], int n){
        int i = 0;
        for(int j = 1; j<n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i+1;
    }

    public static void main(String[] args){
        RemoveDuplicates unduplicate = new RemoveDuplicates();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] arr =  new int[n];

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

        //Unduplicated Array
        System.out.println("Unduplicated Array: ");
        int uniqueCount = unduplicate.removeDuplicates(arr, n);
        for(int j = 0; j<uniqueCount; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
