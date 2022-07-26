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
    public boolean checkTree(TreeNode root) {
        boolean result = false; 
        
        int val = root.val;
        int left = root.left.val;
        int right = root.right.val;
        
        int sum = left+right;
        
        if(val==sum){
            result = true;
        }
        
        return result;
        
    }
}