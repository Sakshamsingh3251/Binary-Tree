class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currlevel = 0;
        while(!q.isEmpty()){
            int size = q.size();
            currlevel++;
            
            List<Integer> level = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
               
                TreeNode node = q.remove();
                level.add(node.val);

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            if(currlevel % 2 == 0){
                Collections.reverse(level);
            }
            ans.add(level);

        }
        return ans;
        
    }
}
