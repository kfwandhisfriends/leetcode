/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
/**
 * 1. 二分搜索
 * 2. if not exists, then use the result 
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length -1);
    }

    private int binarySearch(int[] nums, int target, int low, int high){
        int mid = (low + high) / 2;

        //1 quit condition
        if(low > high){
            return low;
        } 
        
        if(nums[mid] > target) { //target too small ->  left
            return binarySearch(nums, target, low, mid-1);
        } else if(nums[mid] < target) { //target too big -> right
            return binarySearch(nums, target, mid+1, high);
        } else {    //nums[mid] == target              
            return mid;
        }
    }
}
// @lc code=end

