class Solution {
    int leftHeight(TreeNode root) {
        int height = 0;

        while (root != null) {
            height++;
            root = root.left;
        }
        return height;
    }
    int rightHeight(TreeNode root) {
        int height = 0;

        while (root != null) {
            height++;
            root = root.right;
        }
        return height;
    }

    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        int left = leftHeight(root);
        int right = rightHeight(root);
        if (left == right) {
            return (int)Math.pow(2, left) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
