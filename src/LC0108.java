import utils.TreeNode;
public class LC0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start == end) return new TreeNode(nums[end]);
        if (start > end) return null;
        int m = (start + end) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = sortedArrayToBST(nums, start, m-1);
        root.right = sortedArrayToBST(nums, m+1, end);
        return root;
    }
}
