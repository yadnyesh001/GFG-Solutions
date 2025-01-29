//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int i = 0, j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while (j < arr.length) {
            while (j < arr.length && sum <= x) {
                sum += arr[j++];
            }
            if (j == arr.length && sum <= x) break;
            while (i < j && sum - arr[i] > x) {
                sum -= arr[i++];
            }
            ans = Math.min(ans, j - i);
            sum -= arr[i];
            i++;
        }
        if (ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}
