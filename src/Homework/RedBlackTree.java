package Homework;

public class RedBlackTree {
    Node root;

    public RedBlackTree() { // конструктор создаёт корневую чёрную ноду
        this.root = new Node(null, null);
        root.color = Colors.BLACK;
    }

    public enum Colors {
        RED,
        BLACK
    }

    public class Node {
        Integer value;
        Colors color = Colors.RED;
        Node left, right, parent;

        public Node(Integer value, Node parent) {
            this.value = value;
            this.parent = parent;
        }
    }

    public void insert(int value) {
        Node cur = root;
        while (root.value != null) {
            if (value <= cur.value) {
                if (cur.left == null) {
                    cur.left = new Node(value, cur);
                    balance(cur);
                    return;
                } else {
                    cur = cur.left;
                }
            } else {
                if (cur.right == null) {
                    cur.right = new Node(value, cur);
                    balance(cur);
                    return;
                } else {
                    cur = cur.right;
                }
            }
        }
        root.value = value; // До этой строки дойдёт только если дерево ещё пустое
    }

    public void balance(Node cur) {
        boolean needCheck = true;
        while (needCheck) {
            needCheck = false;
            // TODO fix check to ba able to rotate root
            if (exists(cur.left, cur.right) && cur.left.color == Colors.BLACK && cur.right.color == Colors.RED) {
                rotateLeft(cur);
                needCheck = true;
            }

            if (exists(cur.left, cur.right) && cur.color == Colors.RED && cur.left.color == Colors.RED) {
                rotateRight(cur);
                needCheck = true;
            }

            if (exists(cur.left, cur.right) && cur.left.color == Colors.RED && cur.right.color == Colors.RED) {
                changeColor(cur);
                needCheck = true;
            }
        }
        if (root.color == Colors.RED) root.color = Colors.BLACK;
        balance(cur.parent);
    }

    public void rotateLeft(Node node) {
        // TODO check root
        Node cur = node.right;
        cur.parent = node.parent;
        node.parent = cur;
        node.right = cur.left;
        cur.left.parent = node;
        cur.left = node;
        node.color = Colors.RED;
        cur.color = Colors.BLACK;
    }

    public void rotateRight(Node node) {
        Node cur = node.parent;
        if (cur == root) {
            node.parent = null;
            root = node;
        }
        else node.parent = cur.parent;
        cur.parent = node;
        cur.left = node.right;
        node.right.parent = cur;
        node.right = cur;
        cur.color = Colors.RED;
        node.color = Colors.BLACK;
    }

    public void changeColor(Node cur) {
        cur.color = Colors.RED;
        cur.left.color = Colors.BLACK;
        cur.right.color = Colors.BLACK;
    }

    public boolean exists(Node n, Node r){
        return n != null && r != null;
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
