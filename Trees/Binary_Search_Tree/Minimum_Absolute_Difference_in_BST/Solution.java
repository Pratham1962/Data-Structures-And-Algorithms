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
    int min=Integer.MAX_VALUE;
    int prev=Integer.MAX_VALUE;

    public void inorder(TreeNode root){

        if(root==null) return;

        inorder(root.left);
        min=Math.min(min,Math.abs(root.val-prev));
        prev=root.val;
        inorder(root.right);
    }   

    public int getMinimumDifference(TreeNode root) {
        inorder(root);

        return min;
    }
}
