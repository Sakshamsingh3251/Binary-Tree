class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helperBST(nums, 0, nums.length - 1);
    }
    private TreeNode helperBST(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helperBST(nums, left, mid - 1);
        root.right = helperBST(nums, mid + 1, right);
        return root;
    }
}
