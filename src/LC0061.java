import utils.ListNode;

public class LC0061 {
    public static ListNode rotateList(ListNode head, int k) {
        if(k==0 || head == null || head.next == null) return head;
        ListNode ptr = head;
        int n = 1;
        while(ptr.next != null) {
            n++;
            ptr = ptr.next;
        }
        if(k%n == 0) return head;
        else k = k%n;
        ptr.next = head;
        ptr = head;
        for (int i = 1; i < n-k; i++) {
            ptr = ptr.next;
        }
        ListNode temp = ptr.next;
        ptr.next = null;
        return temp;
    }
}
