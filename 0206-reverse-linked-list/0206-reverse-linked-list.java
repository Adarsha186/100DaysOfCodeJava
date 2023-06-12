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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, rev = null, head1=head;
        while(head1!=null){
            rev = head1.next;
            head1.next=prev;
            prev=head1;
            head1=rev;
        }
        return prev;
    }
}