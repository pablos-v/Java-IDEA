package GenTreeProject;

import java.util.ArrayList;

public abstract class GenTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.PARENT));
        tree.add(new Node(parent, child, Relation.CHILD));
    }

    public abstract GenTree build();
    public void print() {
        this.getTree().forEach(node -> System.out.printf("%s, %s, %s \n", node.getFirstPerson().getName(), node.getSecondPerson().getName(), node.getRelation()));
    }
}
