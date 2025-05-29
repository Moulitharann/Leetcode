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
    public boolean findTarget(TreeNode root, int k) {
       HashSet<Integer> ar=new HashSet<>();
       return helper(root,k,ar); 
    }
    private boolean helper(TreeNode root,int k,HashSet<Integer> ar){
        if(root==null) return false;
        if(ar.contains(k-root.val)) return true;
        ar.add(root.val);
        return helper(root.left,k,ar)|| helper(root.right,k,ar);
    }
}