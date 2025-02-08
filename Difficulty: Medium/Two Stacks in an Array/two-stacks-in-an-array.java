//{ Driver Code Starts
import java.util.*;

class TwoStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            twoStacks g = new twoStacks();
            int Q = sc.nextInt();
            while (Q > 0) {
                int stack_no = sc.nextInt();
                int QueryType = sc.nextInt();

                if (QueryType == 1) {
                    int a = sc.nextInt();
                    if (stack_no == 1)
                        g.push1(a);
                    else if (stack_no == 2)
                        g.push2(a);
                } else if (QueryType == 2) {
                    if (stack_no == 1)
                        System.out.print(g.pop1() + " ");
                    else if (stack_no == 2)
                        System.out.print(g.pop2() + " ");
                }

                Q--;
            }
            System.out.println();
            T--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class twoStacks {
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack1 = new Stack<>();
    twoStacks() {
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        stack1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        stack2.push(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if (!stack1.isEmpty()) {
            return stack1.pop();
        }
        return -1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1;
    }
}
