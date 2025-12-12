import java.util.Scanner;

public class MoveZerostoEnd {

    public void moveZerostoEnd(int arr[], int n){
        //Pointing j to first zero
        int j = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                j =i;
                break;
            }
        }
        //Iterating array using i and j pointers
        for(int i = j+1; i<n; i++){
            if(arr[i] != 0){
                //Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZerostoEnd moveZeros = new MoveZerostoEnd();
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

        moveZeros.moveZerostoEnd(arr, n);

        //New Array
        System.out.println("\nNew Array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
