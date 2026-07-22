
class Solution {
    int diff=Integer.MAX_VALUE;
    TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
       inorder(root);
       return diff;
    }
    public void inorder(TreeNode node){
        if(node==null) return;
        inorder(node.left);
        if(prev!=null){
            diff=Math.min(diff,node.val-prev.val);
        }
        prev=node;
        inorder(node.right);
    }
}