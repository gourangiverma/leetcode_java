import utils.ListNode;

public class LC0203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ptr = head, prev = null;
        while (ptr != null) {
            if (ptr.val == val) {
                if (prev == null) {
                    head = ptr.next;
                } else {
                    prev.next = ptr.next;
                }
            } else {
                prev = ptr;
            }
            ptr = ptr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(new int[] {7, 7, 7, 7});
        LC0203 test = new LC0203();
        list.printList();
        list = test.removeElements(list, 7);

    }
}
