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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ar=new ArrayList<>();
        if(root==null) return ar;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int leverOrder=que.size();
            ArrayList<Integer> ls=new ArrayList<>(leverOrder);
            for(int i=0;i<leverOrder;i++){
            TreeNode temp=que.poll();
                ls.add(temp.val);
                if(temp.left!=null) que.add(temp.left);
                if(temp.right!=null) que.add(temp.right);
                
            }
           
            ar.add(0,ls);
        }
        return ar;
    }
}