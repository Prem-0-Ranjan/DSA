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
    public ListNode partition(ListNode head, int x) {
        ListNode ans = new ListNode(0);
        ListNode temp = head;
        ListNode temp2 = ans;
        while(temp != null){
            if(temp.val < x){
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.val >= x){
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}