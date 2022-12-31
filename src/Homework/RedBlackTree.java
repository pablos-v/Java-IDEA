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
            if ((cur.left == null || cur.left.color == Colors.BLACK) && cur.right != null && cur.right.color == Colors.RED) {
                rotateLeft(cur);
                needCheck = true;
            }

            if (cur.color == Colors.RED && cur.left != null && cur.left.color == Colors.RED) {
                rotateRight(cur);
                needCheck = true;
            }

            if (exists(cur.left, cur.right) && cur.left.color == Colors.RED && cur.right.color == Colors.RED) {
                changeColor(cur);
                needCheck = true;
            }
        }
        if (cur.parent != null) balance(cur.parent);
    }

    public void rotateLeft(Node node) {
        Node cur = node.right;
        if (node == root) {
            cur.parent = null;
            root = cur;
        } else {
            cur.parent = node.parent;
            node.parent.left = cur;
        }
        node.parent = cur;
        node.right = cur.left;
        if (cur.left != null) cur.left.parent = node;
        cur.left = node;
        node.color = Colors.RED;
        cur.color = Colors.BLACK;
    }

    public void rotateRight(Node node) {
        Node cur = node.parent;
        if (cur == root) {
            node.parent = null;
            root = node;
        } else {
            node.parent = cur.parent;
            cur.parent.right = node; //
        }
        cur.parent = node;
        cur.left = node.right;
        if (cur.right != null) node.right.parent = cur;
        node.right = cur;
        cur.color = Colors.RED;
        node.color = Colors.BLACK;
    }

    public void changeColor(Node cur) {
        if (cur != root) cur.color = Colors.RED;
        cur.left.color = Colors.BLACK;
        cur.right.color = Colors.BLACK;
    }

    public boolean exists(Node n, Node r) {
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

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(24);
        tree.insert(5);
        tree.insert(1);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        System.out.println(" <-- Set breakPoint for Debugger ");
    }

}
