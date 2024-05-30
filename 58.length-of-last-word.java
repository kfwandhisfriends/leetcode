/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    /**
     * idea: 从后向前遍历，找到第一个space
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        s = eliminateSpaceAtEnd(s);

        int k = getLastSpace(s);
        if(k < 0) { //means there's no space
            return s.length();
        } else {
            return s.length() - k - 1;
        }
    }

    /**
     * 获得 [Eliminate结尾Space的 String] 从后往前第一个space的Index
     * @param s
     * @return 
     */
    private int getLastSpace(String s){

        for(int i = s.length()-1; i >= 0 ; i--){
            //倒序find the first space
            if(s.charAt(i) == ' '){
                return i;
            }
        }

        // if there's no space in String, then return -1
        return -1;
    }

    /**
     * eliminate 最后一个单词后面的space
     * "   fly me   to   the moon  " --> eliminate the spaces after moon
     * @param s
     * @return 删除这些spaces之后的String
     */
    private String eliminateSpaceAtEnd(String s) {
        for(int i = s.length()-1; i >= 0 ; i--){
            if(s.charAt(i) != ' ') { //find the first letter倒序 which is not space
                // then return a new String without the spaces am Ende
                if(i == s.length()-1) {  //there's no space
                    return s;
                } else {
                    return s.substring(0, i+1);
                }
            }
        }

        // not really reachable
        return s;
    }
}
// @lc code=end

