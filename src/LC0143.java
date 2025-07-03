import utils.ListNode;

public class LC0143 {
    public static void reorder(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        // find middle of the list
        ListNode back = head, front = head;
        while (front != null && front.next != null) {
            back = back.next;
            front = front.next.next;
        }
        // reverse the part of the list
        ListNode temp;
        front = back.next;
        back.next = null;
        while(front != null) {
            temp = front.next;
            front.next = back;
            back = front;
            front = temp;
        }
        // start linking
        front = head;
        while(front != null) {
            temp = front.next;
            front.next = back;
            front = temp;
            if(back != null) {
                temp = back.next;
                back.next = front;
            }
            back = temp;
        }
    }
}
