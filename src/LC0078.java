import java.util.ArrayList;
import java.util.List;

public class LC0078 {
    public static void subset(int[] nums, int i, List<Integer> selection, List<List<Integer>> list) {
        if(i==nums.length) {
            list.add(new ArrayList<>(selection));
            return;
        }
        subset(nums, i+1, selection, list);
        selection.add(nums[i]);
        subset(nums, i+1, selection, list);
        selection.removeLast();
    }
}
