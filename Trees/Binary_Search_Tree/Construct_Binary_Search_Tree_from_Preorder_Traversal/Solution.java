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
    public TreeNode bstFromPreorder(int[] preorder) {
        return createBST(preorder, Integer.MAX_VALUE,new int[1]);       
    }

    public static TreeNode createBST(int[] preorder,int max, int[] arr){

        if(arr[0]==preorder.length || preorder[arr[0]]>max) return null;

        TreeNode root=new TreeNode(preorder[arr[0]++]);
        root.left=createBST(preorder,root.val,arr);
        root.right=createBST(preorder,max,arr);

        return root;
    }
}
