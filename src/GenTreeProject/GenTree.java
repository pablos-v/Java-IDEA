package GenTreeProject;

import java.util.ArrayList;

public class GenTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    protected void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.PARENT));
        tree.add(new Node(parent, child, Relation.CHILD));
    }
}
