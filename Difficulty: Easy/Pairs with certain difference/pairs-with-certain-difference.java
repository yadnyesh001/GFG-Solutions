//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int K = Integer.parseInt(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumPairWithDifferenceLessThanK(arr, N, K));
            
        
System.out.println("~");
}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        // Your code goes here 
        int maxSum = 0;
        Arrays.sort(arr);
        for (int i = N - 1; i > 0; --i)
        {
            if (arr[i] - arr[i - 1] < K){
                maxSum += arr[i];
                maxSum += arr[i - 1];
                --i;
            }
        }
        return maxSum;
    }
    
}
