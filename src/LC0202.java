import utils.ListNode;

public class LC0202 {
    public static boolean isHappy(int n, ListNode list) {
        if(n==1) return true;
        else {
            int sum = sumOfDigitsSquared(n);
            ListNode temp = list;
            while(temp.next != null) {
                if(temp.val == sum) return false;
                temp = temp.next;
            }
            temp.next = new ListNode(sum);
            return isHappy(sum, list);
        }
    }
    public static int sumOfDigitsSquared(int n) {
        int d, sum = 0;
        while(n > 0) {
            d = n % 10;
            sum += d*d;
            n = n/10;
        }
        return sum;
    }
}
