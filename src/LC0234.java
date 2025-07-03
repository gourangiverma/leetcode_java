import utils.ListNode;

public class LC0234 {
    public boolean isPalindrome(ListNode head) {
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
        // start comparing two lists, back and front
        while(front != null && front != back) {
            if (front.val != back.val) return false;
            front = front.next;
            back = back.next;
        }
        return true;
    }
}
