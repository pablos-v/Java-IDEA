public class Start {

    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(4);
        ln1.next.next = new ListNode(3);

        ListNode ln2 = new ListNode(5);
        ln2.next = new ListNode(6);
        ln2.next.next = new ListNode(4);

        System.out.println(sol.addTwoNumbers(ln1, ln2));
    }
}
