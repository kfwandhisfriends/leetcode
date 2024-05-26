/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target){
        // use hashmap to storage      
        var checkList = new HashMap<Integer, Integer>();

        // iterate the array 
        // calculate the complement as == target - nums[i]
        // check if the complement was already in the hashmap
        // if not, then add //! the nums[i] into hashmap
        // if already exist, then return 
        int complement;
        for(int i = 0; i< nums.length; i++){
            complement = target - nums[i];

            if(! checkList.containsKey(complement)){
                //then add the element into hashmap
                checkList.put(nums[i], i);
            } else {
                // answer founded
                return new int[] {i, checkList.get(complement)};
            }
        }

        return new int[]{};
    }
}
// @lc code=end

//trivialweise:
/** 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length ; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
*/
