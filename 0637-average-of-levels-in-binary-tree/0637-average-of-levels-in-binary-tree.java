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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ls=new ArrayList<>();
        if(root==null) return ls;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            double tempvalue=0;
            int size=que.size();
            for(int i=0;i<size;i++){
                 TreeNode temp=que.poll();
                  tempvalue+=temp.val;
                  if(temp.left!=null) que.add(temp.left);
                  if(temp.right!=null) que.add(temp.right);

            }
            ls.add(tempvalue/size);
        }
          return ls;
    }
}