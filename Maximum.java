import java.util.*;

public class MaxSumMNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N and M
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        
        // Read the N numbers
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array in descending order
        Arrays.sort(arr);
        
        // Compute the sum of the largest M numbers
        int maxSum = 0;
        for (int i = N - 1; i >= N - M; i--) {
            maxSum += arr[i];
        }
        
        // Print the maximum sum
        System.out.println(maxSum);
        
        sc.close();
    }
}
