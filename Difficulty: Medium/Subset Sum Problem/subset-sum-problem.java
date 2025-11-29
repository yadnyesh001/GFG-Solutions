class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean dp[] = new boolean[sum+1];
        dp[0] = true;
        for(int i=0; i<arr.length; i++){
            for(int j=sum; j>=arr[i]; j--){
                dp[j] = dp[j] || dp[j-arr[i]];
            }
        }
        return dp[sum];
    }
}