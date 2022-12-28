package Homework;

public class RedBlackTree {
    Node root;

    public class Node {
        int value;
        enum Color{
            RED,
            BLACK
        }
        Node left, right;
    }

    public void insert(int value){

    }

    public void balance(){

    }

    public void rotateLeft(){

    }

    public void rotateRight(){

    }

    public void changeColor(){

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

    }

}
