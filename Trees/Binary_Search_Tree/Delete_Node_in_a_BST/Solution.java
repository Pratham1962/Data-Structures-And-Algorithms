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
    public TreeNode deleteNode(TreeNode root, int val) {
        
        if(root==null) return null;
        if(root.val==val) return helper(root);

        TreeNode cur=root;
        while(cur!=null){
            if(val<cur.val){
               
                if(cur.left!=null && cur.left.val==val){
                    cur.left=helper(cur.left);
                    break;
                }
                else{
                    cur=cur.left;
                }
            }
            else{
                if(cur.right!=null && cur.right.val==val){
                    cur.right=helper(cur.right);
