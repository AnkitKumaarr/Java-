import javax.swing.tree.TreeNode;

public class MaxDepthLC104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
        return 0;
        return 1 +  Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
