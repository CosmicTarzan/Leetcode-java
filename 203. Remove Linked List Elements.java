class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode head2 = new ListNode();
        ListNode l = head2;
        while(head != null){
            if(head.val == val){
                head = head.next;
            }
            else{
                l.next = new ListNode(head.val);
                l = l.next;
                head = head.next;
            }
        }
        return head2.next;
    }
}
