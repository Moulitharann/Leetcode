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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ar = new ArrayList<>();
        inOrder(root, ar);
        return ar.get(k - 1); 
    }

    private void inOrder(TreeNode root, List<Integer> ar) {
        if (root == null) return;
        inOrder(root.left, ar);
        ar.add(root.val);
        inOrder(root.right, ar);
    }

}