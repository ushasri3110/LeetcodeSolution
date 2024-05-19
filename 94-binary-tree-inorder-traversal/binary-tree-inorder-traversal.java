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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorderTraversalHelper(root,arr);
        return arr;
    }
    public void inorderTraversalHelper(TreeNode root,ArrayList<Integer> arr){
        if (root==null){
            return;
        }
        inorderTraversalHelper(root.left,arr);
        arr.add(root.val);
        inorderTraversalHelper(root.right,arr);
    }
}