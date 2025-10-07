
import java.util.*;

class Solution {
    int countPartitions(int[] arr, int d) {
        int total = 0;
        for (int num : arr) total += num;

        // Check if (total + d) is even and valid
        if ((total + d) % 2 != 0 || total < d) return 0;

        int target = (total + d) / 2;
        int n = arr.length;

        int[] dp = new int[target + 1];
        dp[0] = 1; // one way to make sum 0 — pick nothing

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[target];
    }
}
