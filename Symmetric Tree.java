class Solution {
    public boolean isSymmetric(TreeNode root) {
        invertTree(root.left);
        return isSameTree(root.left , root.right);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        if(!isSameTree(p.left , q.left)){
            return false;
        }
        if(!isSameTree(p.right , q.right)){
            return false;
        }
        return true;
        
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        //root
        TreeNode temp = root.left;//swapping subtrees
        root.left = root.right;
        root.right = temp;
        //left
        invertTree(root.left);
        //right
        invertTree(root.right);
        return root;
        
    }
}
// class Solution {

//     private boolean check(TreeNode l, TreeNode r) {
//         if (l == null && r == null) return true;
//         if (l == null || r == null) return false;
//         if (l.val != r.val) return false;

//         return check(l.left, r.right) && check(l.right, r.left);
//     }

//     public boolean isSymmetric(TreeNode root) {
//         return check(root.left, root.right);
//     }
// }
