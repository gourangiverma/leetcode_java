import java.util.ArrayList;
import java.util.List;

public class LC0046 {
    public static void permute(int[] nums, int i, List<List<Integer>> list) {
        if(i == nums.length) {
            // convert nums to arrayList
            List<Integer> p = new ArrayList<>();
            for (int x : nums) p.add(x);
            list.add(new ArrayList<>(p));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            // swap nums[i] with nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            // recursion call
            permute(nums, i+1, list);
            // undo step - swap again
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
