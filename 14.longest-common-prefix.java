/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //从para中选定一个最小的str
        //维护一个最大公约string
        /*
        String prefix = Arrays.stream(strs).min( (s1, s2) ->  Integer.compare(s1.length(), s2.length())) .orElse(null);
        */
        String prefix = strs[0];

        for (String str : strs) {
            if (str.length() < prefix.length()) {
                prefix = str;
            }
        }

        //iterate the array
        for(int i = 0; i < strs.length; i++) {
            // iterate every character in String
            for(int j = 0; j < (strs[i].length() <= prefix.length()? strs[i].length() : prefix.length()); j++){
                if(strs[i].charAt(j) != prefix.charAt(j)){
                    // Update prefix
                    prefix = prefix.substring(0, j);
                    if(prefix.isEmpty()){
                        return prefix;
                    }
                } 
            }
        }

        return prefix;
    }
}
// @lc code=end

