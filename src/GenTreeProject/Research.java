package GenTreeProject;

import java.util.ArrayList;

interface Research {
    ArrayList<Person> findRelatives(String researchPerson, Relation researchRelation);

    void findSiblings();

    default ArrayList<Person> allPersonsInTree(GenTree tree) {
        ArrayList<Person> arr = new ArrayList<>();
        tree.getTree().forEach(node -> {
            if (!arr.contains(node.getFirstPerson())){
                arr.add(node.getFirstPerson());
                System.out.println(node.getFirstPerson());
            }
        });
        return arr;
    }

    default void countGenerationPriority() {
//        TODO

    }
}
