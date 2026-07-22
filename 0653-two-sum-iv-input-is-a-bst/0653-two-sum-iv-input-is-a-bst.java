
class Solution {
    HashSet<Integer> set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root,k);
    }
    public boolean dfs(TreeNode node,int k){
        if(node==null) return false;
        if(set.contains(k-node.val)) return true;
        set.add(node.val);
        return dfs(node.left,k) || dfs(node.right,k);
    }
}