/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        if(head1 == null || head2 == null){
            return null;
        }
        int l1 = 0;
        int l2 = 0;
        Node h1 = head1;
        Node h2 = head2;
        while(h1 != null){
            h1 = h1.next;
            l1++;
        }
        while(h2 != null){
            h2 = h2.next;
            l2++;
        }
        if(l1 == l2){
            while(head1 != head2){
                head1 = head1.next;
                head2 = head2.next;
            }
            return head1;
        }
        else if(l1 > l2){
            int x = l1 - l2;
            while(x > 0){
                head1 = head1.next;
                x--;
            }
            while(head1 != head2){
                head1 = head1.next;
                head2 = head2.next;
            }
            return head1;
        }
        else{
            int x = l2 - l1;
            while(x > 0){
                head2 = head2.next;
                x--;
            }
            while(head1 != head2){
                head1 = head1.next;
                head2 = head2.next;
            }
            return head1;
        }
    }
}