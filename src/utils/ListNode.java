package utils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] arr) {
        if(arr.length == 0) {
            return;
        }
        this.val = arr[0];
        ListNode ptr = this;
        for (int i = 1; i < arr.length; i++) {
            ptr.next = new ListNode(arr[i]);
            ptr = ptr.next;
        }
    }

    /* currently there is no way of knowing the difference between
     * []: an un-initialized list node, which by default has value 0, and null next pointer
     * [0]: a singleton list which has the value of 0 and next = null
     * */
    public void printList() {
        ListNode ptr = this;
        System.out.print("[");
        while(ptr != null) {
            System.out.print(ptr.val + ", ");
            ptr = ptr.next;
        }
        System.out.println("\b\b]");
    }
}
