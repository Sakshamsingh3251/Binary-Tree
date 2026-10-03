class Solution {
    private void inorder(TreeNode root , ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);
    }
    private TreeNode construct(int l , int r , ArrayList<Integer> list ){//for construction balanced binary search tree
        if(l > r){
            return null;
        }
        int mid = l + ( r - l)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = construct(l  , mid - 1 , list);
        root.right = construct(mid+1 , r , list);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list);
        int l = 0;
        int r = list.size() - 1;
        return construct(l, r , list);

    }
}
