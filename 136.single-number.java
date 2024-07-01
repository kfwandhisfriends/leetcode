/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {

        /**
         * 0与任何数字xor的结果是该数字本身
         * idea:    两个相同数字xor的结果是0
         *          xor的运算满足交换律 -> 顺序无关
         */
        int x = 0;
        for(int element: nums) {
            x ^= element;
        } 
        return x;
        

        /** 
        //idea: 遍历一次 --> 线性时间       
        //      每轮迭代检查 if the Element already in the Hashmap
        //      if already exist: then delete it;
        //      if not     exist: then add it into HashMap
        //      then at the End there's only one Element in Hashmap
        var hashSet = new HashSet<Integer>();

        for(int element : nums) {
            if(hashSet.contains(element)) {
                hashSet.remove(element);
            } else {
                hashSet.add(element);
            }
        }

        return hashSet.iterator().next();
        */
    }
}
// @lc code=end

