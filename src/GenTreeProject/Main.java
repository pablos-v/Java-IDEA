package GenTreeProject;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GenTree myTree = new TreeBuilder().build();
        MyResearch research = new MyResearch(myTree);

//        myTree.printToConsole(myTree);
//        myTree.printToConsoleWithIterator(myTree);

        var allChildrenOfMitya = research.findRelatives("Mitya", Relation.CHILD);
        System.out.println(allChildrenOfMitya.toString());

        research.findSiblings();

        var allSistersOfIgor = research.findRelatives("Igor", Relation.SISTER);
        System.out.println(allSistersOfIgor);

        myTree.printToConsoleWithIterator2(myTree);

        List<Person> allPersonsInTree = research.allPersonsInTree(myTree);
        System.out.println(allPersonsInTree);

//        Collections.sort(allPersonsInTree);
//        allPersonsInTree.stream().sorted(new Compare());
        System.out.println(allPersonsInTree.stream().sorted(new Compare()).toList());


    }
}



