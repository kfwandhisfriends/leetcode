/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start

import java.math.BigInteger;

class Solution {
    /**
     * given x, to find a, a^2 <= x < (a+1)^2
     * @param x
     * @return a
     */
    public int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        return (int)binarySearch(x, 0, x);
    }

    private long binarySearch(int target, long low, long high){
        //int mid1 = (low + high) /2;
        long mid = (low + high) /2;

        if(mid * mid == target || mid * mid < target && (mid+1) * (mid+1) > target) {
            return mid;
        } else if( mid * mid < target){ //mid to small
            return binarySearch(target, mid, high);
        } else {                       //mid to big
            return binarySearch(target, low, mid);
        }
    }
}
// @lc code=end

