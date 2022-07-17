package GenTreeProject;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class GenTree implements Iterator<Node>, Printer {
    private ArrayList<Node> tree = new ArrayList<>();
    protected int index;
    protected int indexNext;

    public ArrayList<Node> getTree() {
        return tree;
    }

    protected void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.PARENT));
        tree.add(new Node(parent, child, Relation.CHILD));
    }

    public abstract GenTree build();

    @Override
    public boolean hasNext() {
        return index++ < tree.size();
    }

    @Override
    public Node next() {
        return tree.get(indexNext++);
    }
}
