import java.util.*;
class Solution{
    //Function for finding Intersection
    public List<Integer> findIntersection(int arr1[], int arr2[], int n, int m){
        List<Integer> Intersection = new ArrayList<>();
        
        int i = 0; int j = 0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                j++;
            }else{
                Intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        return Intersection;
    }
}

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the First Array: ");
        int  n = sc.nextInt();
        int[] arr1 = new int[n];

        //Input First Array
        for(int i = 0; i<n; i++){
            System.out.print("Enter Element "+i+" :");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the Second Array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        //Input Second Array
        for(int i = 0; i<m; i++){
            System.out.print("Enter Element "+i+" :");
            arr2[i] = sc.nextInt();
        }

        //Print Array 1
        System.out.println("Array 1: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }

        //Print Array 2
        System.out.println("\nArray 2: ");
        for(int i = 0; i<m; i++){
            System.out.print(arr2[i]+" ");
        }

        Solution obj = new Solution();
        List<Integer> result = obj.findIntersection(arr1, arr2, n, m);

        System.out.print("\nThe Intersection of arr 1 and arr2 is: ");
        for(int val : result){
            System.out.print(val+" ");
        }
    }
}
