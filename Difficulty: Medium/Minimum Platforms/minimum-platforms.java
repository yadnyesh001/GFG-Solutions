class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int arrival = 0;
        int depature = 0;
        int counter = 0;
        int max = 0;
        while (arrival < arr.length) {
            if (arr[arrival] <= dep[depature]) {
                counter++;
                max = Math.max(counter, max);
                arrival++;
            } else {
                counter--;
                depature++;
            }
        }
        return max;
    }
}
