package GenTreeProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

interface Research {
    ArrayList<Person> findRelatives(String researchPerson, Relation researchRelation);

    void findSiblings();

    default ArrayList<Person> allPersonsInTree(GenTree tree) {
//        ArrayList<Person> arr = new ArrayList<>();
//        tree.getTree().forEach(node -> {
//            if (!arr.contains(node.getFirstPerson())) {
//                arr.add(node.getFirstPerson());
//            }
//        });
//        return arr;
        Set<Person> set = new HashSet<>();
        tree.getTree().forEach(node -> set.add(node.getFirstPerson()));
        return new ArrayList<>(set);
    }
}
