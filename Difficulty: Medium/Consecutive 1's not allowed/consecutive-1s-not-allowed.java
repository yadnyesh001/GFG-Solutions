// User function Template for Java

class Solution {
    int countStrings(int n) {
        // code here
        int x = 2;
        int y = 3;
        if(n == 1){
            return 2;
        }
        if(n == 2){
            return 3;
        }
        int sum = 0;
        for(int i=3; i<=n; i++){
            sum = x+y;
            int temp = y;
            y = sum;
            x = temp;
        }
        return sum;
    }
}