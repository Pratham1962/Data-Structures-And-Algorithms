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

    int ans=Integer.MIN_VALUE;
    int[] arr=new int[2];

    public void inorder(TreeNode root, int k){

        if(root==null) return;

        inorder(root.left,k);
        arr[0]++;
        if(arr[0]==k){
            arr[1]=root.val;
            return;
        }
        inorder(root.right,k);
    }

    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root,k);

        return arr[1];
    }
}
