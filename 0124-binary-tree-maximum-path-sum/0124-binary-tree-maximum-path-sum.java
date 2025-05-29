class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, helper(node.left));   // Only include positive paths
        int right = Math.max(0, helper(node.right));

        maxSum = Math.max(maxSum, node.val + left + right); // Possible max at this node

        return node.val + Math.max(left, right);  // Only one side can be passed upward
    }
}
