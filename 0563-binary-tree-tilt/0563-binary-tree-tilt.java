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
    static int totaltilt;
    public int findTilt(TreeNode root) {
        totaltilt=0;
        if(root== null) return 0;
         find(root);
        return totaltilt;
    }
    private int find(TreeNode root){
        if(root == null){
            return 0;
        }
        int l=find(root.left);
        int r=find(root.right);
         totaltilt+=Math.abs(l-r);
        return l+r+root.val;
    }
}