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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ar=new ArrayList<>();
        if(root ==null) return ar;
         Queue<TreeNode> que=new LinkedList<>();
         que.add(root);
         while(!que.isEmpty()){
            int level=que.size();
            
            for(int i=0;i<level;i++){
                TreeNode temp=que.poll();
            if(i==level-1)
            {
                ar.add(temp.val);
            }
               if(temp.left!=null) que.add(temp.left);
               if(temp.right!=null) que.add(temp.right);
            }
            
          
        }
         return ar;
    }
}