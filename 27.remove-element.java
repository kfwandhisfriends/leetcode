/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // 1.iterate
        //   and set the element == val to an unvalid number
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                k++;
                nums[i] = -1;
            }
        }

        // 2.push valid elements nach vorne
        // 3.and return the valur numbers of elements in array
        return pushValid(nums, k);
    }

    /**
     * 
     * @param nums an Array like [1, 2, -1, 3, -1]
     *              -->           [1, 2, 3, -1, -1]
     * @param k     the number of valid numbers in Array
     */
    private int pushValid(int[] nums, int k){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            //find the next valid number
            if(nums[i] != -1){ //if it's valid
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = index + 1; i < nums.length; i++){
            nums[i] = -1;
        }

        return index;
    }
}
// @lc code=end

