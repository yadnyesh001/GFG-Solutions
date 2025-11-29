// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int target = sum/2;
        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        for(int i=0; i<arr.length; i++){
            for(int j=target; j>=arr[i]; j--){
                dp[j] = dp[j] || dp[j-arr[i]];
            }
        }
        int s1 = 0;
        for (int i = target; i >= 0; i--) {
            if (dp[i]) {
                s1 = i;
                break;
            }
        }
        return sum - 2 * s1;
    }
}
