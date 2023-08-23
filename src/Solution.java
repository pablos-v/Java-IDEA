/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1;
        int val2;
        int dec = 0;
        ListNode res = new ListNode(0);
        ListNode needle = res;
        while (l1 != null || l2 != null || dec != 0) {
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            } else val1 = 0;

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            } else val2 = 0;

            needle.val = val1 + val2 + dec;
            if (needle.val > 9) {
                dec = 1;
                needle.val = needle.val % 10;
            } else dec = 0;

            if (l1 != null || l2 != null || dec != 0) {
                needle.next = new ListNode();
                needle = needle.next;
            }

        }

        return res;
    }

}