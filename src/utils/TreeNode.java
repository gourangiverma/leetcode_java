package utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void display() {
        display(this, "");
    }
    private void display(TreeNode root, String indent) {
        if (root != null) {
            System.out.println(indent + root.val);
            display(root.left, indent + "\t");
            display(root.right, indent + "\t");
        }
    }
}
