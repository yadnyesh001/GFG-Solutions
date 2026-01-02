/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Node h = head;
        while(h != null){
            list.add(h.data);
            h = h.next;
        }
        for(int i=0; i<list.size(); i++){
            if(!list.get(i).equals(list.get(list.size() - i - 1))){
                return false;
            }
        }
        return true;
    }
}