package Homework;

public class RedBlackTree {
    Node root;

    public RedBlackTree() { // конструктор создаёт корневую чёрную ноду
        this.root = new Node(null);
        root.isRoot = true;
        root.color = Colors.BLACK;
    }

    public enum Colors {
        RED,
        BLACK
    }

    public class Node {
        Integer value;
        boolean isRoot = false;
        Colors color = Colors.RED;
        Node left, right;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if (root.value == null) root.value = value;
        else {
            Node cur = root;

            while (cur != null) {
                if (value <= cur.value) {
                    if (cur.left == null) {
                        cur.left = new Node(value); // как вернуться?
                        return;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        cur.right = new Node(value); // как вернуться?
                        return;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }

    public void balance() {

    }

    public void rotateLeft() {

    }

    public void rotateRight() {

    }

    public void changeColor() {

    }

    public Node find(int value) {
        Node cur = root;
        while (cur != null) {
            if (cur.value == value) return cur;
            cur = cur.value > value ? cur.left : cur.right;
        }
        return null;
    }

    public void printTree() {
        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);
        System.out.println("---");
        System.out.println(root.left.left.value);
        System.out.println(root.left.right.value);
        System.out.println(root.right.left.value);
        System.out.println(root.right.right.value);
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(10);
        tree.insert(13);
        tree.insert(7);
        tree.insert(11);
        tree.insert(15);
        tree.insert(5);
        tree.insert(8);
        tree.printTree();

    }

}
