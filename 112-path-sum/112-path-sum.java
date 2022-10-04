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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean res=dfs(root,targetSum);
        return res;    
    }
    public boolean dfs(TreeNode root,int targetSum){
        if(root==null){
            return false;
        }
        if(targetSum-root.val==0 && root.left==null && root.right==null){
            return true;
        }
        boolean left=dfs(root.left,targetSum-root.val);
        boolean right=dfs(root.right,targetSum-root.val);
        if(right==true || left==true){
            return true;
        }
        else{
            return false;
        }
    }
}