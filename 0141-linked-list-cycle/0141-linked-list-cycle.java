/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<ListNode>();
        ListNode x=head;
        while(x!=null && x.next!=null){
            if(s.contains(x)){
                return true;
            }
            s.add(x);
            x=x.next;
        }
        return false;
    }
}