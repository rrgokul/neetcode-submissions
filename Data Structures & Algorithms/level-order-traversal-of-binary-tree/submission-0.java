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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> result = new ArrayList<>();
        int level = 0;
        if(root == null ){
            return result;
        }
        while(!q.isEmpty()
        ){
            List<Integer> nums = new ArrayList<>();
            result.add(nums);
            LinkedList<TreeNode> nodes = new LinkedList();
            while(!q.isEmpty()){
            TreeNode n = q.poll();
            nums.add(n.val);
            if(n.left != null){
                nodes.add(n.left);
            }

            if(n.right != null){
                nodes.add(n.right);
            }
            }
            q = nodes;
        }
        return result;
    }
}
