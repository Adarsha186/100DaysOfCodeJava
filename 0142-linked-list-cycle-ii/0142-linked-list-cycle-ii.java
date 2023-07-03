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
    public ListNode detectCycle(ListNode head) {
        ListNode x=head;
        HashSet<ListNode> s = new HashSet<>();
        while(x!=null && x.next!=null){
            if(s.contains(x)){
                return x;
            }
            s.add(x);
            x=x.next;
        }
        return null;
    }
}