import utils.Node;

public class LC0116 {
    public Node connect(Node root) {
        if (root == null) return root;

        Node current = root, next, prev = null, left = root;
        while (current.left != null) {
            left = current.left;
            prev = null;
            while (current != null) {
                if (prev != null) prev.next = current.left;
                current.left.next = current.right;
                prev = current.right;
                current = current.next;
            }
            current = left;
        }

        return root;
    }
}
