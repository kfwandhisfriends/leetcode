/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start

import java.util.List;

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
// quit condition
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> toReturn = new ArrayList<Integer>();
        inorder(root, toReturn);
        return toReturn;
    }

    private void inorder(TreeNode root, List<Integer> toReturn) {
        if(root == null) {
            return;
        }

        inorder(root.left, toReturn);
        toReturn.add(root.val);
        inorder(root.right, toReturn);
    }
}
// @lc code=end

