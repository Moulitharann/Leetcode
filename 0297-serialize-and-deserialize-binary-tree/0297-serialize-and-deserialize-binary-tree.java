/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<String> ar = new ArrayList<>();
        helper(root, ar);
        return String.join(",", ar);  // convert list to comma-separated string
    }

    private void helper(TreeNode node, ArrayList<String> ar) {
        if (node == null) {
            ar.add("null");
            return;
        }
        ar.add(String.valueOf(node.val));
        helper(node.left, ar);
        helper(node.right, ar);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> str = new LinkedList<>(Arrays.asList(data.split(",")));  // use LinkedList for easy removal
        return helper2(str);
    }

    private TreeNode helper2(List<String> str) {
        if (str.isEmpty()) return null;
        String temp = str.remove(0);  // remove first
        if (temp.equals("null")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(temp));
        node.left = helper2(str);
        node.right = helper2(str);
        return node;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));