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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=1;
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        int x=i-n-1;
        System.out.println(x+" "+i);
        temp=head;
        if(x<0){return head.next;}
        for(int j=0;j<x;j++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}