//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.maximumPoints(arr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        for(int i=1; i<m; i++){
            arr[i][0] = arr[i][0] + Math.max(arr[i-1][1], arr[i-1][2]);
            arr[i][1] = arr[i][1] + Math.max(arr[i-1][0], arr[i-1][2]);
            arr[i][2] = arr[i][2] + Math.max(arr[i-1][0], arr[i-1][1]);
        }
        int max = 0;
        for(int i=0; i<n; i++){
            if(max < arr[m-1][i]){
                max = arr[m-1][i];
            }
        }
        return max;
    }
}