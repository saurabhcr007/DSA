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
    List<Integer> list;

    public List<List<Integer>> levelOrder(TreeNode root) {
     
      List<List<Integer>> list1 = new ArrayList();
        for(int i =1;i<=height(root);i++){
            list = new ArrayList<>();
          
            list1.add(levelPrint(root,i));
        }
    return list1;
    }

    public List<Integer> levelPrint(TreeNode root, int level)     {
       
      
            if (root == null) {
                return null;
            }
            if (level == 1)
               list.add(root.val);
            else if (level > 1) {
                levelPrint(root.left, level - 1);
                levelPrint(root.right, level - 1);
            }

        
        return list;
    }
	
    public  int height(TreeNode root){
      if(root==null){
          return 0;
      }
        return Math.max(height(root.left),height(root.right))+1;
    }
}