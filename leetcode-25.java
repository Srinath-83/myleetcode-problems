class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        ListNode curr = head;

        while (true) {
            ListNode kth = getKthNode(curr, k);
            if (kth == null) break;

            ListNode nextGroupStart = kth.next;

            ListNode prev = null;
            ListNode temp = curr;

            while (temp != nextGroupStart) {
                ListNode next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }
            prevGroupEnd.next = kth;
            curr.next = nextGroupStart;
            prevGroupEnd = curr;
            curr = nextGroupStart;
        }

        return dummy.next;
    }
    private ListNode getKthNode(ListNode node, int k) {
        while (node != null && k > 1) {
            node = node.next;
            k--;
        }
        return node;
    }
}
