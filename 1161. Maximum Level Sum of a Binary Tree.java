
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int maxsum = Integer.MIN_VALUE;
        int maxlevel = 1;
        int currlevel = 1;

        while (!q.isEmpty()) {
            int levelsize = q.size();
            int levelsum = 0;

            for (int i = 0; i < levelsize; i++) {
                TreeNode node = q.remove();
                levelsum += node.val;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
            if (levelsum > maxsum) {
                maxsum = levelsum;
                maxlevel = currlevel;
            }
            currlevel++;
        }
        return maxlevel;
    }
}
