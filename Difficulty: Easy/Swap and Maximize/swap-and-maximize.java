//{ Driver Code Starts
import java.io.*;
import java.util.*;

// Driver class

// } Driver Code Ends
// User function Template for Java

class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);
        Long xyz[] = new Long[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i += 2) {
            xyz[i] = arr[count++];
        }

        if (arr.length % 2 == 0) {
            for (int i = arr.length - 1; i >= 0; i -= 2) {
                xyz[i] = arr[count++];
            }
        } else {
            for (int i = arr.length - 2; i >= 0; i -= 2) {
                xyz[i] = arr[count++];
            }
        }
        long diff = 0;
        for(int i=0; i<xyz.length-1; i++){
            diff = diff + Math.abs(xyz[i+1] - xyz[i]);
        }
        diff = diff + Math.abs(xyz[xyz.length-1]-xyz[0]);
        return diff;
    }
}


//{ Driver Code Starts.
class Main {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the Long integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into Long integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            // Convert ArrayList to array
            Long[] arr = new Long[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call maxSum method and print result
            long ans = ob.maxSum(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends