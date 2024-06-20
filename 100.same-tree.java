/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start

import java.util.ArrayList;
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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> listP = new ArrayList<>();
        List<Integer> listQ = new ArrayList<>();

        preOrder(p, listP);
        preOrder(q, listQ);
    
        return listP.equals(listQ);
        
    }

    private void preOrder(TreeNode root, List<Integer> toReturn) {
        if(root == null) { 
            toReturn.add(null); //must add null here, otherwise [1,2,3] will be == [1,null,2,3]
            return;
        }

        toReturn.add(root.val);
        preOrder(root.left, toReturn);
        preOrder(root.right, toReturn);
    }
}
// @lc code=end

