class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maximumSum = currentSum;
        for (int i = k; ci < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }
        return (double) maximumSum / k;
    }
}
