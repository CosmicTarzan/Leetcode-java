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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ArrayList arr = new ArrayList();
        ListNode l3 = head;

        for(ListNode list: lists){
            while(list != null){
                if(list != null){
                    arr.add(list.val);
                    list = list.next;
                }
            }
        }

        Collections.sort(arr);
        
        for(int i = 0; i < arr.size(); i++){
            l3.next = new ListNode((int) arr.get(i));
            l3 = l3.next;
        }
        return head.next;
    }
}
