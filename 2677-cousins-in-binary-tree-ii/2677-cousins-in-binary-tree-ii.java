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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currentLevelSum = root.val;

        while (!q.isEmpty()) {
            int nextLevelSum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                curr.val = currentLevelSum - curr.val;

                int siblingSum = (curr.left != null ? curr.left.val : 0) + (curr.right != null ? curr.right.val : 0);
                nextLevelSum += siblingSum;

                if (curr.left != null) {
                    curr.left.val = siblingSum;
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    curr.right.val = siblingSum;
                    q.add(curr.right);
                }
            }
            currentLevelSum = nextLevelSum;
        }
        return root;
    }
}