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
    public int kthSmallest(TreeNode root, int k) {
        //PriorityQueue<Integer> q = new PriorityQueue<>(k, Comparator.comparing(TreeNode::val).reversed());
        //Max heap
        int[] counts ={0};
        return processTree(root, counts, k);
        
        }
    int processTree(TreeNode root, int[] counts, int k){
        //System.out.println("root.val - " + root.val);
        int num=0;
        if(root.left != null){
            num = processTree(root.left, counts, k);
        }
        //System.out.println("after left num - " + num);
        //System.out.println("after left count - " + counts[0]);
        
        if(counts[0] == k){
            return num;
        }
        counts[0]+=1;
        num = root.val;
        //System.out.println("curr val num - " + num);
        if(counts[0] != k && root.right != null){
            num = processTree(root.right, counts, k);
        }
        //System.out.println("final return num - " + num);
        return num;
    }
}
