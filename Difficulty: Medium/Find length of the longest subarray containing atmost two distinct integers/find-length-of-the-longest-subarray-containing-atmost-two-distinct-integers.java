//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call totalFruits method and print result
            Integer ans = ob.totalElements(arr);
            System.out.println(ans);

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalElements(Integer[] arr) {
        // code here
        Map<Integer, Integer> mp = new HashMap<>();
        int i = 0, j = 0, n = arr.length;
        int size = 0;
        while (j < n) {
            int current = arr[j];
            mp.put(current, mp.getOrDefault(current, 0) + 1);
            while (mp.size() > 2) {
                int left = arr[i];
                mp.put(left, mp.get(left) - 1);
                if (mp.get(left) == 0) {
                    mp.remove(left);
                }
                i++;
            }
            size = Math.max(size, j - i + 1);
            j++;
        }
        return size;
    }
}