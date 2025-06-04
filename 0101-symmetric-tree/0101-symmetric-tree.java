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
    public boolean isSymmetric(TreeNode root) {
        if(root == null ) return true;
        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode leftsub,TreeNode rightsub){
        if(leftsub == null && rightsub == null ) return true;
        if(leftsub == null || rightsub == null ) return false;
        if(leftsub.val != rightsub.val) return false;
        return helper(leftsub.left,rightsub.right) && helper(leftsub.right,rightsub.left);
    }
    
}