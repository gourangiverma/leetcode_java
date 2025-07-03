import utils.TreeNode;

public class LC0297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    int start = 0;
    public TreeNode deserialize(String data) {
        if (start == -1) return null;
        int end = indexOf(data, start,',');
        try {
            int value;
            if (end == -1) value = Integer.parseInt(data);
            else value = Integer.parseInt(data.substring(start, end));
            TreeNode root = new TreeNode(value);
            start = end+1;
            root.left = deserialize(data);
            root.right = deserialize(data);
            return root;
        } catch (NumberFormatException e) {
            start = end+1;
            return null;
        }
    }
    private int indexOf(String data, int start, char c) {
        for (int i = start; i < data.length(); i++) {
            if (data.charAt(i) == c) return i;
        }
        return -1;
    }
}
