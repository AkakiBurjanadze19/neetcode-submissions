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
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Deque<ListNode> stack = buildStack(head);

        ListNode current = stack.pop();
        head = current;

        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;

        return head;
    }

    private Deque<ListNode> buildStack(ListNode node) {
        Deque<ListNode> stack = new ArrayDeque<>();

        ListNode current = node;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        return stack;
    }
}
