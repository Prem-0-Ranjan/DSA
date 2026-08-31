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
    public int[] nextLargerNodes(ListNode head) {
        int s = 0;
        ListNode temp = head;
        while(temp != null){
            s++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[s];
        int k = 0;
        while(temp != null){
            int val = temp.val;
            ListNode temp2 = temp;
            arr[k] = 0;
            while(temp2 != null){
                if(temp2.val > val){
                    arr[k] = temp2.val;
                    break;
                }
                temp2 = temp2.next;
            }
            k++;
            temp = temp.next;
        }
        return arr;
    }
}