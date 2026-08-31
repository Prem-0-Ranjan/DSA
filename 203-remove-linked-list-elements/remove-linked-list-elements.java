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
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = head;
        while(curr != null){
            if(head.val == val){
                head = head.next;
                curr = head;
                prev = head;
            }
            else if(curr.val == val){
                while(curr != null && curr.val == val){
                    curr = curr.next;
                }
                while(prev.next != null && prev.next.val != val){
                    prev = prev.next;
                }
                prev.next = curr;
                prev = curr;
            }
            else{
                curr = curr.next;
            }
        }
        while(prev != null){
            if(prev.val == val) prev.next = null;
            prev = prev.next;
        }
        return head;
    }
}