/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution {
    /**
     * idea: 相消
     * if 元素相同then增加count
     * else --
     *      if count <0 then 换winner
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int winner = nums[0]; 
        int count = 1; //count must be set to 1 cuz winner was already [0]
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == winner) {
                count++;
            } else { //if it's not winner
                count--;
            }

            if(count < 0) {
                winner = nums[i];
                count = 1; // reset the counter
            }
        }

        return winner;
    }
}
// @lc code=end

