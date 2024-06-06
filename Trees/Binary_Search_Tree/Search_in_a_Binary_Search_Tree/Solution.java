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
 **/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
        return null;

        if(root.val == val)
        return root;

        TreeNode t;
        if(val < root.val){
            t = searchBST(root.left, val);
        } else {
            t = searchBST(root.right, val);
        }
        return t;

    }
   
}
