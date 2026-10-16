class Solution {
    private boolean checkone(TreeNode root){
        if(root == null){
            return false;
        }
        if(root.val == 1){
            return true;
        }
        if (checkone(root.left)) {
            return true;
        }
        if (checkone(root.right)) {
            return true;
        }
        return false;
    }
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if(!checkone(root.left)){
            root.left = null;
        }
        if(!checkone(root.right)){
            root.right = null;
        }
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }
}
