/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    //检查needle是否在haystack里，如果是返回index
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }

        for(int i = 0; i < haystack.length(); i++){

            boolean match = true;

            for(int j = 0; j < needle.length(); j++){
                //当haystack剩余字符少于needle长度 就应该返回-1
                if(haystack.length() - i < needle.length()){
                    return -1;
                }

                //逐个匹配char
                if(needle.charAt(j) != haystack.charAt(i+j)){
                    match = false;
                    break;
                }

                //匹配完成
                if(match && j == needle.length()-1){
                    return i;
                }
            }
        }

        return -1;
    }
}
// @lc code=end

