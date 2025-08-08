class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                list.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        for(int i=1; i<=arr.length; i++){
            if(!set.contains(i)){
                list.add(i);
                break;
            }
        }
        return list;
    }
}
