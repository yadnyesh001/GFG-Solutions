class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int target = sum/2;
        int dp[] = new int[target+1];
        dp[0] = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=target; j>=arr[i]; j--){
                dp[j] = dp[j] + dp[j-arr[i]];
            }
        }
        int s1 = 0;
        for (int i = target; i >= 0; i--) {
            if(dp[i]>0){
                if(sum-2*i == diff){
                    return dp[i];
                }
            }
        }
        return 0;
    }
}
