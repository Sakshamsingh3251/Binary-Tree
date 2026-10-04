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
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<TreeNode> result = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        duplicates(root);
        return result;
    }
    private String duplicates(TreeNode root){
        if(root == null){
            return "NULL";
        }
        String left = duplicates(root.left);//"2 4"
        String right = duplicates(root.right);//"2 4"

        String s = root.val + "," + left + " ," + right;
        //if(is have seen this subtree once and it is its second occurance){
        //     then add this string to the result;
        //}
        int count = map.getOrDefault(s , 0);
        if(count == 1){
            result.add(root);

        }
        map.put(s , map.getOrDefault(s , 0 ) +1 );
        return s;


    }
}
