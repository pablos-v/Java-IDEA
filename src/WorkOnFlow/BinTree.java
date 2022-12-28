package WorkOnFlow;

public class BinTree {

    Node root;

    public class Node {
        int value;
        Node left, right;
    }

    public Node find(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            if (current.value > value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

}
