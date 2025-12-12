import java.util.*;
class LeftRotateBy1Place{

    public void leftRotate(int arr[], int n){
        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args){
        LeftRotateBy1Place leftrotate = new LeftRotateBy1Place();
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

        leftrotate.leftRotate(arr, n);
        
        //Rotated Array
        System.out.println("\nRotated Array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}