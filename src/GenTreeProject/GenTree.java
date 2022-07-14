package GenTreeProject;
import java.util.ArrayList;

public class GenTree {
    ArrayList<Node> tree;

    public void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.PARENT));
        tree.add(new Node(parent, child, Relation.CHILD));
    }

    public ArrayList<Person> findRelatives(Person researchPerson, Relation researchRelation) {
        ArrayList<Person> result = new ArrayList<>();
        tree.forEach(node -> {
            if (node.firstPerson.name.equals(researchPerson.name) && node.relation == researchRelation) {
                result.add(node.secondPerson);
            }
        });
        return result;
    }

    public void printer() {
        tree.forEach(node -> {
            System.out.printf("%s, %s, %s", node.firstPerson.name, node.secondPerson.name, node.relation);
            System.out.println();
        });
    }

    public void findSiblings() {
        int len = tree.size();
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len; i++) {
                if (tree.get(i).equals(tree.get(j))) continue;
                //if parent`s name is same
                if (tree.get(j).secondPerson.name.equals(tree.get(i).secondPerson.name) && tree.get(j).relation.equals(Relation.PARENT) && tree.get(i).relation.equals(Relation.PARENT)) {
                    tree.add(new Node(tree.get(j).firstPerson, tree.get(i).firstPerson, tree.get(i).firstPerson.sex.equals("w") ? Relation.SISTER : Relation.BROTHER));
                    tree.add(new Node(tree.get(i).firstPerson, tree.get(j).firstPerson, tree.get(j).firstPerson.sex.equals("w") ? Relation.SISTER : Relation.BROTHER));
                }
            }
        }
    }


}
