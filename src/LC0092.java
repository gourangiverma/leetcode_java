import utils.ListNode;

public class LC0092 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head == null || head.next == null) return head;
        ListNode ptr = (left==1)?null:head;
        for (int i = 1; i < left-1; i++) {
            ptr = ptr.next;
        }
        ListNode back = (left==1)?head:ptr.next, front = back.next, temp;
        back.next = null;
        for (int i = left; i < right; i++) {
            temp = front.next;
            front.next = back;
            back = front;
            front = temp;
        }
        if(ptr!=null) {
            assert ptr.next != null;
            ptr.next.next = front;
            ptr.next = back;
        }
        else {
            head.next = front;
            return back;
        }
        return head;
    }
}
