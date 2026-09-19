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
    public void reorderList(ListNode head) {
        //find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow is middle
        //reverse part-2

        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode l2 = prev;
        ListNode l1 = head;
        //stich together
        prev = null;
        ListNode newhead = null;
        boolean even = false;
        while(l1 != null || l2 != null){
            if(prev == null){
                newhead = l1;
                prev = l1;
                l1 = l1.next;
                even = !even;
            }
            if(even && l2 != null){
                prev.next = l2;
                prev = prev.next;
                l2 = l2.next;
                even = !even;
            } else if (l1 != null){
                prev.next = l1;
                prev = prev.next;
                l1 = l1.next;
                even = !even;
            }

        }

    }
}
