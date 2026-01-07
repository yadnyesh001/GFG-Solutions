class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=k-1; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            list.add(map.size());
            int out = arr[i - k + 1];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }
        }
        return list;
    }
}