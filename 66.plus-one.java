/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

class Solution {
    /**
     * idea:    1. if digits末尾没有9, then just add one to the last number of Array;
     *          2. if digits全部位都是9, then add the length of Array;
     *          3. else: 用循环检查最前面的 连续的9, 然后在n-1位 + 1
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        // if ende no 9
        if(digits[digits.length-1] != 9) {
            digits[digits.length-1]++;
            return digits;
        }

        // check if the array besteht only aus 9
        boolean allNine = true;
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] != 9){
                allNine = false;
                break;
            }
        }

        if(allNine){
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        } else {
            // search for the linkest 9
            for(int i = digits.length -1; i >= 0; i--) {
                if(digits[i] != 9){  //case 1/2 make sure here's safe
                    //make the i-1位 +1
                    digits[i]++;
                    //set i位之后的全部变成0
                    for(int j = i+1; j < digits.length; j++){
                        digits[j] = 0;
                    }

                    return digits;
                }
            }
            return digits;
        }

        //not really reachable
    }
}
// @lc code=end

