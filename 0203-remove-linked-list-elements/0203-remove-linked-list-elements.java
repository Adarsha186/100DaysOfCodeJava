/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode(-1);
        p.next=head;
        ListNode x=p;
        while(x.next!=null){
            if(x.next.val!=val){
                x=x.next;
            }
            else{
                x.next=x.next.next;
            }
        }
        return p.next;
    }
}