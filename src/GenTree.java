import java.util.ArrayList;

class GenTree {
    ArrayList<Node> tree = new ArrayList<>();

    public void addNode(Person parent, Person child) {
        tree.add(new Node(child, parent, Relation.parent));
        tree.add(new Node(parent, child, Relation.child));
    }

    public ArrayList<Person> findRelatives(Person person, Relation rel) {
        ArrayList<Person> res = new ArrayList<>();
        tree.forEach(node -> {
            if (node.one.name.equals(person.name) && node.rel == rel) {
                res.add(node.two);
            }
        });
        return res;
    }

    public void printer() {
        tree.forEach(node -> {
            System.out.printf("%s, %s, %s", node.one.name, node.two.name, node.rel);
            System.out.println();
        });
    }

    public void findSiblings() {
        int len = tree.size();
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len; i++) {
                if (tree.get(i).equals(tree.get(j))) continue;
                //if parent`s name is same
                if (tree.get(j).two.name.equals(tree.get(i).two.name) && tree.get(j).rel.equals(Relation.parent) && tree.get(i).rel.equals(Relation.parent)) {
                    tree.add(new Node(tree.get(j).one, tree.get(i).one, tree.get(i).one.sex.equals("w") ? Relation.sister : Relation.brother));
                    tree.add(new Node(tree.get(i).one, tree.get(j).one, tree.get(j).one.sex.equals("w") ? Relation.sister : Relation.brother));
                }
            }
        }
    }

    public static void main(String[] args) {
        Person Mitya = new Person("Mitya", "m");
        Person Nina = new Person("Nina", "w");
        Person Igor = new Person("Igor", "m");
        Person Kolya = new Person("Kolya", "m");
        Person Larisa = new Person("Larisa", "w");

        GenTree myTree = new GenTree();
        myTree.addNode(Mitya, Nina);
        myTree.addNode(Mitya, Igor);
        myTree.addNode(Igor, Kolya);
        myTree.addNode(Nina, Larisa);

        var set1 = myTree.findRelatives(Mitya, Relation.child);
        System.out.println(set1.toString());

        myTree.findSiblings();
        var set2 = myTree.findRelatives(Nina, Relation.brother);
        System.out.println(set2.toString());
        myTree.printer();
    }

    enum Relation {
        child,
        parent,
        brother,
        sister
    }

    static class Person {
        String name;
        String sex;

        public Person(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Node {
        Person one;
        Person two;
        Relation rel;

        public Node(Person one, Person two, Relation rel) {
            this.one = one;
            this.two = two;
            this.rel = rel;
        }


    }

}
