//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isBSTTraversal(a);
            System.out.println(ans ? "True" : "False");
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isBSTTraversal(int arr[]) {
        // code here
        int n = arr.length;
        if (n == 0 || n == 1){
            return true;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i-1] >= arr[i]){
                return false;
            }   
        }
        return true;
    }
}
