package GenTreeProject;

import java.util.ArrayList;

public class GenTree {
    private ArrayList<Node> tree;

    public void setTree(ArrayList<Node> tree) {
        this.tree = tree;
    }

    public ArrayList<Node> getTree() {
        return tree;
    }

    protected void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.PARENT));
        tree.add(new Node(parent, child, Relation.CHILD));
    }

    public GenTree build() {
        tree = new ArrayList<>();

        Person Mitya = new Person("Mitya", "m");
        Person Nina = new Person("Nina", "w");
        Person Igor = new Person("Igor", "m");
        Person Kolya = new Person("Kolya", "m");
        Person Larisa = new Person("Larisa", "w");

        this.addNode(Mitya, Nina);
        this.addNode(Mitya, Igor);
        this.addNode(Igor, Kolya);
        this.addNode(Nina, Larisa);

        return this;
    }


}
