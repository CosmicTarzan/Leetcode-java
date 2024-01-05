class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head2 = new ListNode();
        ListNode l = head2;
        if(head == null){
            return head2.next;
        }
        int value = head.val;
        head = head.next;
        l.next = new ListNode(value);
        l = l.next;
        while(head != null){
            if(head.val == value){
                head = head.next;
                continue;
            }
            else{
                value = head.val;
                head = head.next;
                l.next = new ListNode(value);
                l = l.next;
            }
        }
        return head2.next;
    }
}
