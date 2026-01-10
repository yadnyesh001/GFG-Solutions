class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int m = wt.length+1;
        int n = W+1;
        int dp[][] = new int[m][n];
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(j >= wt[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i-1][j-wt[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
