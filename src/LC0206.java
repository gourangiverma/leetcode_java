import utils.ListNode;

public class LC0206 {
    public static ListNode reverseList(ListNode head) {
        ListNode back = head, front = head.next, temp;
        back.next = null;
        while(front != null) {
            temp = front.next;
            front.next = back;
            back = front;
            front = temp;
        }
        return back;
    }
}
