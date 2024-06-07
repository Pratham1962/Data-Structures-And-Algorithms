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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null) return new TreeNode(val);
        TreeNode node=root;
        TreeNode prev=null;

        while(node!=null){

            if(node.val<val){
                prev=node;
                node=node.right;
            }

            else {
                prev=node;
                node=node.left;
            }
        }

        if(prev.val<val) prev.right=new TreeNode(val);
        else prev.left=new TreeNode(val);

        return root;
    }
}
