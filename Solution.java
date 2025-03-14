class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
   static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void display(ListNode head) {
    	ListNode temp = head;

	while (temp != null) {
	    System.out.print(temp.val + "->");
	    temp = temp.next;
	}
	System.out.println("End");
    }

    public static void main(String[] args) {
    	ListNode last = new ListNode(5, null);
	ListNode second = new ListNode(6, last);
	ListNode head = new ListNode(7, second);

	display(head);
	ListNode head2 = reverseList(head);
       display(head2);	
    }
}
