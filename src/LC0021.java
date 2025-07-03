import utils.ListNode;

public class LC0021 {
    public static ListNode mergeSortedLL(ListNode ptr, ListNode other) {
        // if one of the lists is blank
        if(ptr == null) return other;
        if(other == null) return ptr;

        ListNode returnVal;
        if (ptr.val <= other.val) {
            returnVal = ptr;
        } else {
            returnVal = other;
            other = ptr;
            ptr = returnVal;
        }

        while(ptr.next != null) {
            if(ptr.next.val <= other.val) {
                ptr = ptr.next;
            } else {
                ListNode temp = ptr.next;
                ptr.next = other;
                ptr = ptr.next;
                other = temp;
            }
        }
        ptr.next = other;
        return returnVal;
    }
}
