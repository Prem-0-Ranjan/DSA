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
    public ListNode deleteDuplicates(ListNode head) {
        // if(head == null) return head;
        // if(head.next != null && head.val == head.next.val){
        //     while(head != null && head.next != null && head.val == head.next.val){
        //     head = head.next;
        //     }
        //     head = head.next;
        // }
       
    
    
        // ListNode temp = head;
        // ListNode slow = head;
        // ListNode fast = head;
        // while(fast != null && fast.next != null){
        //     if(fast.val == fast.next.val){
        //         while(fast != null && fast.next != null && fast.val == fast.next.val){
        //             fast = fast.next;
        //         }
        //         slow.next = fast.next;
        //     }
        //     else{
        //         slow = slow.next;
        //     }
        //         fast = fast.next;
        // }
        // return head;




        if(head == null) return head;

        ListNode ans = new ListNode(0);
        ans.next = head;

        ListNode slow = ans;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            if(fast != null && fast.next != null && fast.val == fast.next.val){
                while(fast != null && fast.next != null && fast.val == fast.next.val){
                    fast = fast.next;
                }
                slow.next = fast.next;
            }
            else{
                slow = slow.next;
            }
            fast = fast.next;
        }
        return ans.next;
    }
}