//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            Stack<Integer> myStack = new Stack<>();
            int n = temp.length;
            // adding elements to the stack
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(temp[i]);
                myStack.push(x);
            }
            Solution obj = new Solution();
            obj.deleteMid(myStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> st) {
        // code here
        int n = st.size();
        Stack<Integer> tempSt = new Stack();
        int count = 0;
        while (count < n / 2) {
            int c = st.peek();
            st.pop();
            tempSt.push(c);
            count++;
        }
        st.pop();
        while (!tempSt.empty()) {
            st.push(tempSt.peek());
            tempSt.pop();
        }
    }
}
