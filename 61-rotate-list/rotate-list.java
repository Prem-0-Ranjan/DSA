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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        if(head == null) return head;
        ListNode temp = head;
        ListNode nhead = head;
        ListNode tail = head;

        while(temp != null){
            size++;
            // if(temp.next != null) tail = temp;
            temp = temp.next;
        }
        while(tail != null && tail.next != null) tail = tail.next;
        temp = head;
        k = k % size;
        if(k == 0) return head;
        for(int i = 1; i <= size - k- 1;i++){
            temp = temp.next;
        }
        nhead = temp.next;
        temp.next = null;
        tail.next = head;
        return nhead;
    }
}