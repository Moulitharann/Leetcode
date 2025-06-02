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
        if(root==null) return true;
        Queue<TreeNode> left=new LinkedList();
        Queue<TreeNode> right=new LinkedList();
        left.add(root.left);
        right.add(root.right);
        while(!left.isEmpty() || !right.isEmpty()){
            TreeNode left1=left.poll();
            TreeNode right1=right.poll();
            if(left1==null  && right1 ==null)  continue;
            if(left1== null || right1 == null || left1.val != right1.val) return false;
            left.add(left1.left);
            left.add(left1.right);
            right.add(right1.right);
            right.add(right1.left);
        }
        return true;
    }
}