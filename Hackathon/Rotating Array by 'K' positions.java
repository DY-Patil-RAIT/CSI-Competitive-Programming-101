import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        long k = sc.nextLong(); 
        k = k % n; 

        
        if (k != 0) {
            rotateRight(arr, n, (int) k);
        }

        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    
    private static void rotateRight(int[] arr, int n, int k) {
        reverse(arr, 0, n - 1);      
        reverse(arr, 0, k - 1);      
        reverse(arr, k, n - 1);      
    }

    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
