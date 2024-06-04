/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        var current = head;
        while(current != null && current.next != null){
            //compare the current value with the next
            if(current.val == current.next.val){ //if there's duplicates then ignore it from the linkedlist
                if(current.next.next == null){   //if 待检查element是倒数第二个
                    current.next = null;

                    current = current.next;
                } else {    // then safe delete
                    current.next = current.next.next;
                    //do not [current = current.next] here, cuz 111 -> 11
                }
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
// @lc code=end

