
class Solution {
    public static int LongestBitonicSequence(int n, int[] nums) {
        // code here
        int inc[] = lengthOfLIS(nums);
        int dec[] = lengthOfLDS(nums);
        int max = -1;
        for(int i=0; i<n; i++){
            if(inc[i] > 1 && dec[i] > 1){
                max = Math.max(max, inc[i]+dec[i]);
            }
        }
        if(max == -1){
            return 0;
        }
        return max-1;
    }
    
    public static int[] lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }
    
    public static int[] lengthOfLDS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }
}
