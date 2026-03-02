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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        if(root==null) return ans;
        path(root,"",ans);
        return ans;
    }
    public void path(TreeNode node,String way,List<String> ans){
        if(node==null) return;
        if(node.left==null && node.right==null){
            ans.add(way+node.val);
            return;
        }
        path(node.left,way+node.val+"->",ans);
        path(node.right,way+node.val+"->",ans);
    }
}