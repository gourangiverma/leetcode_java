import utils.ListNode;

public class LC0025 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;
        ListNode returnValue = head, groupStart = head, groupEnd = head, back, front, temp = null, temp2;

        while(groupStart != null) {
            // locate groupEnd: if groupEnd is not found, end the list
            for (int i = 0; i < k; i++) {
                // if there is no groupEnd, do not reverse this group. end the process.
                if (groupEnd == null) {
                    if(temp!=null) temp.next = groupStart;
                    return returnValue;
                }
                if (i == k - 1) {
                    // groupEnd of first group is the returnValue
                    if(groupStart == head) returnValue = groupEnd;
                        // the last node of this group is to be linked to previous group
                    else if(temp != null) temp.next = groupEnd;
                }
                groupEnd = groupEnd.next;
            }
            // reverse k nodes
            back = groupStart;
            front = back.next;
            back.next = null;
            while (front != groupEnd) {
                if (front.next == null) {
                    front.next = back;
                    break;
                }
                temp2 = front.next;
                front.next = back;
                back = front;
                front = temp2;
            }
            // iterate
            temp = groupStart;
            groupStart = groupEnd;
        }
        return returnValue;
    }
}
