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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        if(root!=null) queue.offer(root);

        while(!queue.isEmpty()){
            int length=queue.size();

            for(int i=0;i<length;i++){
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                
                if(i==0) ans.add(queue.poll().val);
                else queue.poll();
            }
        }

        return ans;
        

    }
}
