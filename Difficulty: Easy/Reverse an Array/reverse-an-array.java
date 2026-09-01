class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int x = arr.length/2;
        for(int i=0; i<x; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
    }
}