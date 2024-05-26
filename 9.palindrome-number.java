/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isPalindrome(int x){
        //idea: 1. 排除边界情况: 负数X, 个位数为0 X
        //      2. 反转后半数字
        //      3. compare

        // 1.
        if(x < 0 || (x % 10 == 0 && x != 0) ){ //! 0是唯一的例外
            return false; 
        }3

        // 2.
        int halfReversed = 0;
        while (halfReversed < x){ //! dont make it <=, then if input = 0; then 0<=0 unendlich
            halfReversed = halfReversed * 10 +  (x % 10);
            x = x / 10;
        }

        // 3.
        //  if length =奇数, then use /10 to eliminate 中间数
        return x == halfReversed || x == halfReversed /10;
    }


    //wieder trivial
    /** 
    public boolean isPalindrome(int x){
        // idea:1. convert the para into String
        //      2. use the String.reverse() 
        //      3. compare

        // 1
        String str = ((Integer) x).toString(x);

        // 2
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String strReversed = builder.toString();

        // 3
        return str.equals(strReversed)? true : false;
    }

    */
    
    // trivial
    /**
    public boolean isPalindrome(int x) {
         * 1. make int into String
         * 2. split the String into 2 parts:
         * 3. push the one part into a stack
         * 4. pop it back and merge them into a new String
         * 5. check if the new string == the old, unused String

        // 1
        String wholeString = ((Integer) x).toString(x);
        // 2
        String part1, part2;
        int len = wholeString.length();
        if (len % 2 == 0) { // 偶数
            part1 = wholeString.substring(0, len / 2);
            part2 = wholeString.substring(len / 2);
        } else {
            part1 = wholeString.substring(0, len / 2);
            part2 = wholeString.substring(len / 2 + 1);
        }

        // 3
        Deque<Character> stack = new ArrayDeque<>();
        // push all the chararcters into stack
        for (int i = 0; i < part1.length(); i++) {
            stack.push(part1.charAt(i));
        }

        // 4 build the new String to compare with part2
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        String inverse = builder.toString();
        
        // 5 compare
        return inverse.equals(part2)? true: false;
    }
    */
}
// @lc code=end

