public class MaximumSumSubarray {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;
        
        // Calculate the sum of the first subarray of size K
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        
        maxSum = currentSum;
        
        // Calculate the sum of subsequent subarrays by sliding the window
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        int maxSum = findMaxSumSubarray(arr, k);
        
        System.out.println("Maximum sum of a subarray of size " + k + ": " + maxSum);
    }
}
