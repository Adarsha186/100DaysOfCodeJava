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
    String s="";
    public String tree2str(TreeNode root) {
        preorder(root); 
        return s;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return ;  
        }
        s=s+String.valueOf(root.val);
        if(root.left!=null){
            s=s+"(";
            preorder(root.left);
            s=s+")";
        }
        else if(root.left==null && root.right!=null){
            s=s+"()";
        }
        if(root.right!=null){
            s=s+"(";
            preorder(root.right);
            s=s+")";
        }
        /*else if(root.left!=null && root.right==null){
            s=s+"()";
        }*/
    }
}