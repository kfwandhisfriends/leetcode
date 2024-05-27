/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                // set this block to a unvalid number
                // and regularize it later
                nums[i] = -101;
            }
        }

        //把非-101的值move到前面
        return moveValid(nums);
    }

    /**
     * 1. 把有效位push到array前面，
     * 2. 对于有效位之后的全部赋值unvalid
     * 3. 返回有效位数
     * @param nums the given array to be bearbeitet
     * @return the number of valid elements after removing duplicating
     */
    private int moveValid(int[] nums){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != -101){ //it's a valid value
                //put it into the first
                nums[index] = nums[i];
                index++;
            }
        }
        //index同时记录 前index位为有效位
        //对于index之后(+1)的element, 遍历赋值
        for(int i = index + 1; i < nums.length; i++){
            nums[i] = -101;
        }

        return index;
    }

}
// @lc code=end

