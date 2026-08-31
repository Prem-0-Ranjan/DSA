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
        // List<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // int k = list.size()-1;
        // while(temp != null){
        //     temp.val = list.get(k);
        //     temp = temp.next;
        //     k--;
        // }
        // return head;
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}