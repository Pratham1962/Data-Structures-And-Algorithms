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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();

        if(root!=null) queue.offer(root);
        boolean flag=true;

        while(!queue.isEmpty()){
            int length=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<length;i++){
                
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                if(flag) temp.add(queue.poll().val);
                else temp.add(0,queue.poll().val);
     
            }
            flag=!flag;

            ans.add(temp);
        }

        return ans;
    }
}
