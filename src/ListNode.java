import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        List<Integer> ls = new ArrayList<>();
        ListNode node = this;
        while (node.next != null) {
            ls.add(node.val);
            node = node.next;
        }
        ls.add(node.val);
        return ls.toString();
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
