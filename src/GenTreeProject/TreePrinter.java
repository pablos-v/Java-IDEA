package GenTreeProject;

public class TreePrinter {
    GenTree tree;

    public TreePrinter(GenTree tree) {
        this.tree = tree;
    }

    public void print() {
        tree.getTree().forEach(node -> {
            System.out.printf("%s, %s, %s \n", node.getFirstPerson().getName(), node.getSecondPerson().getName(), node.getRelation());
        });
    }
}
