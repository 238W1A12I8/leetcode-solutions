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
    List<Integer> list=new ArrayList<>();
    public void helper(TreeNode root){
        if(root==null) return ;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        helper(root);
        Collections.sort(list);
        int fst=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)>fst){
                return list.get(i);
            }
        }
        System.out.print(list);
        return -1;
    }
}