package GenTreeProject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Research {
    ArrayList<Person> findRelatives(String researchPerson, Relation researchRelation);

    void findSiblings();

    default List<Person> allPersonsInTree(GenTree tree) {
//        можно попробовать переписать метод allPersonsInTree класса Research с помощью Stream API

        ArrayList<Person> arr = new ArrayList<>();
        tree.getTree().forEach(x -> arr.add(x.getFirstPerson()));
        return arr.stream().distinct().toList();
    }
}
