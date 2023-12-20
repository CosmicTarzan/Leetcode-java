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
        int counter = 0;
        ListNode h = new ListNode(0);
        ListNode ans = h;
        int mem = -1;
        while(head != null){
            counter += 1;
            if (counter % 2 == 1){
                mem = head.val;
            }else{
                ans.next = new ListNode(head.val);
                ans = ans.next;
                ans.next = new ListNode(mem);
                ans = ans.next;
                mem = -1;
            }
            head = head.next;
        }
        if(mem >= 0){
            ans.next = new ListNode(mem);
            ans = ans.next;
        }
        return h.next;
    }
}
