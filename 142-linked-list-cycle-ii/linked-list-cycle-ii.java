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
        int c = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = slow.next;
                c++;
                while(slow != fast){
                    c++;
                    slow = slow.next;
                }
                break;
            }
        }
        if(c == 0) return null;
         slow = head;
         fast = head;
         for(int i = 0; i < c; i++){
            slow = slow.next;
         }
         while(slow != fast){
            slow = slow.next;
            fast = fast.next;
         }
         return fast;
    }
}