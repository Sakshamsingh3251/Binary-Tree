/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> que = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        que.add(root);
        
        while(!que.isEmpty()){
            int n = que.size();
            TreeNode rightnode = null;
            for(int i = 0 ; i < n ; i++){
                rightnode = que.remove();

                if(rightnode.left != null){
                    que.add(rightnode.left);
                }
                if(rightnode.right != null){
                    que.add(rightnode.right);
                }

            }
            result.add(rightnode.val);
        }
        return result;
        
    }
}
