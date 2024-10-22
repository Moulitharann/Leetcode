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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> minheap = new PriorityQueue<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            long levelsum = 0;
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                levelsum += curr.val;
                
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right); // Corrected to add right child
            }
            
            minheap.add(levelsum);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }
        
        return minheap.size() < k ? -1 : minheap.peek();
    }
}
