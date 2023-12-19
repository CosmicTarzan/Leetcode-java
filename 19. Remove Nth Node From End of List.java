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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode(0);
        ListNode l = h;
        ListNode h2 = new ListNode(0);
        ListNode l2 = h2;
        int count = 0;
        int count2 = 0;
        while(head != null){
            l.next = new ListNode(head.val);
            l = l.next;
            head = head.next;
            count += 1;
        }
        h = h.next;
        while(h != null){
            if (count2 == count - n){
                h = h.next;
            }
            else{
                l2.next = new ListNode(h.val);
                l2 = l2.next;
                h = h.next;
            }
            count2 += 1;
        }
        return h2.next;
    }
}
