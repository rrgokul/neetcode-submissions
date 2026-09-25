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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return findRootAndTest(root, subRoot);
    }
    boolean findRootAndTest(TreeNode root, TreeNode subRoot) {
        if(root.val == subRoot.val){
            //subRoot candidate
            boolean isSame = isSame(root, subRoot);
            if(isSame){
                return true;
            }
        }
        if(root.left != null){
            boolean isSame = findRootAndTest(root.left, subRoot);
            if(isSame){
                return true;
            }
        }
        if(root.right != null){
            boolean isSame = findRootAndTest(root.right, subRoot);
            if(isSame){
                return true;
            }
        }
        return false;
        
    }
    boolean isSame(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot != null){
            return false;
        }
        if(root != null && subRoot == null){
            return false;
        }
        if(root == null && subRoot == null){
            return true;
        }
        if(root.val != subRoot.val){
            return false;
        }
        boolean isSub = isSame(root.left, subRoot.left);
        if(!isSub){
            return false;
        }
        isSub = isSame(root.right, subRoot.right);
        if(!isSub){
            return false;
        }
        return true;
        
    }    
}
