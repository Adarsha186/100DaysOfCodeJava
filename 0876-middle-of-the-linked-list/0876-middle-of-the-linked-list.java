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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int i=1;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        int mid = (i/2);
        temp=head;
        while(mid>0){
            temp=temp.next;
            mid--;
        }
        return temp;
    }
}