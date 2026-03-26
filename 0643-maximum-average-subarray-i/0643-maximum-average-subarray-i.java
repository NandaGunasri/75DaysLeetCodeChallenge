class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: First window sum
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        long maxSum = sum;
        
        // Step 2: Sliding window
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        // Step 3: Return average
        return (double) maxSum / k;
    }
}