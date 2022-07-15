package GenTreeProject;

import java.util.ArrayList;

public interface GenTree {
    ArrayList<Node> tree = new ArrayList<>();

    default ArrayList<Node> getTree() {
        return tree;
    }

    default void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.PARENT));
        tree.add(new Node(parent, child, Relation.CHILD));
    }
}
