public class LC0494 {
    public static int targetSum(int[] numbers, int i, int target) {
        // base case: reached end of array
        if(i==numbers.length) {
            return (target==0) ? 1 : 0;
        }
        // possible cases: take +numbers[i] or -numbers[i]
        int branch1 = targetSum(numbers, i+1, target-numbers[i]);
        int branch2 = targetSum(numbers, i+1, target+numbers[i]);

        return branch1 + branch2;
    }
}
