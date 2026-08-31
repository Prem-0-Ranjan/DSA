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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        ListNode curr = head;
        ListNode prev = head;
        while(curr != null && curr.next != null){
            if(set.contains(head.val)){
                head = head.next;
                curr = head;
                prev = head;
            }
            else if(set.contains(curr.val)){
                while(curr != null && set.contains(curr.val)){
                    curr = curr.next;
                }
                while(!set.contains(prev.next.val)){
                    prev = prev.next;
                }
                prev.next = curr;
                prev = curr;
            }
            
           else curr = curr.next;
        }
        if(curr != null && set.contains(curr.val)){
            while(prev.next != curr) prev = prev.next;

            prev.next = null;
        }
        return head;
    }
}