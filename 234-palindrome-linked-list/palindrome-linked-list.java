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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        int size = 0;
        ListNode temp = head;
        while( temp != null){
            size++;
            sb.append(temp.val);
            temp = temp.next;
        }
        if(size < 2) return true;
        return isPali(sb);
    }
    boolean isPali(StringBuilder sb){
        int l = 0;
        int r = sb.length() - 1;
        while( l < r){
            if(sb.charAt(l) != sb.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}