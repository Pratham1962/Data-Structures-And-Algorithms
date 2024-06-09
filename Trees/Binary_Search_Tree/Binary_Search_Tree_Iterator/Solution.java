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
class BSTIterator {

    Stack<TreeNode> stack=new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        push(root);
    }
   
    public int next() {
        TreeNode cur=stack.pop();
        push(cur.right);
        return cur.val;
    }
   
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void push(TreeNode root){
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */



