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
    public ListNode swapPairs(ListNode head) {
        // if(head == null) return head;
        // int size = 0;
        // ListNode temp = head;
        // ListNode ans = new ListNode(0);
        // ans.next = head;
        // ListNode prev = ans;
        // ListNode curr = head;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }
        // if(size < 2) return head;
        // temp = head;
        // size = size - (size % 2);
        // while(curr != null && curr.next != null){
        //     prev.next = curr.next;
        //     ListNode c = prev;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = curr.next;
        // }
        // return ans.next;

        if(head == null || head.next == null) return head;
        ListNode nhead = head.next;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            ListNode next = curr.next;
            if(prev != null) prev.next = next;

            curr.next = next.next;
            next.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return nhead;
    }
}