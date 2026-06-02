//Leetcode Q.234

class Solution{
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null) return true;

        //find middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        //reverse
        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        //compares halves
        ListNode left = head;
        ListNode right = prev;

        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}