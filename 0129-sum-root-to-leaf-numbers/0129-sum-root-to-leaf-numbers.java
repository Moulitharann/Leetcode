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
     ArrayList<String> ar=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
       if(root==null) return 0;
        helper(root,"");
        int sum=0;
        for(String a:ar){
            sum+=Integer.parseInt(a);
        }
        return sum;
    }
    private void helper(TreeNode node,String str){
        if(node==null ) return;
        str+=Integer.toString(node.val);
        if(node.left==null && node.right==null)
        {
            ar.add(str);
            return;
        }
        helper(node.left,str);
        helper(node.right,str);
    }
}