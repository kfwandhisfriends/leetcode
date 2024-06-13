/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start

class Solution {
    /**
     *
     * @param nums1 the array which will be filled
     * @param m     the number of valid elements in Array1
     * @param nums2 the array whose elements will be added
     * @param n     the number of valid elements in Array2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // create Pointer for both Arrays
        int p1 = 0;
        int p2 = 0;
        // create an empty Array to fill in
        int[] result = new int[m+n];
        int index = 0;

        while(p1 < m || p2 < n) { //break if any pointer is going to be out of index
            if(p1 == m) {                    // p1 has reached the "valid" boundry
                result[index] = nums2[p2];
                index++; p2++;
            } else if(p2 == n) {             // p2 has reached the valid boundry
                result[index] = nums1[p1];
                index++; p1++;
            } else if(nums1[p1] > nums2[p2] ) {
                result[index] = nums2[p2];
                index++; p2++;
            } else { //(nums1[p1] <= nums2[p2])
                result[index] = nums1[p1];
                index++; p1++;
            }
        }
        while(p1 < m || p2 < n) { //break if any pointer is going to be out of index
            if(nums1[p1] > nums2[p2] ) {
                result[index] = nums2[p2];
                index++; p2++;
            } else if(nums1[p1] <= nums2[p2]) {
                result[index] = nums1[p1];
                index++; p1++;
            } else if(p1 == m) { // p1 has reached the "valid" boundry
                result[index] = nums2[p2];
                index++; p2++;
            } else {             // p2 has reached the valid boundry
                result[index] = nums1[p1];
                index++; p1++;
            }
        }

        //move result to nums1
        for (int i = 0; i< m+n; i++) {
            nums1[i] = result[i];
        }
    }
}
// @lc code=end

