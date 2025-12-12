import java.util.*;
public class LeftRotateByDPlaces {

    public void Reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public void leftRotate(int arr[], int n, int d){
        Reverse(arr, 0, d-1);
        Reverse(arr, d, n-1);
        Reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        LeftRotateByDPlaces leftrotate = new LeftRotateByDPlaces();
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

        leftrotate.leftRotate(arr, n, 3);

        //Rotated Array
        System.out.println("\nRotated Array: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
