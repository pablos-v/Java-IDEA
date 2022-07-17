package GenTreeProject;

public class Main {
    public static void main(String[] args) {

        GenTree myTree = new TreeBuilder().build();
        MyResearch research = new MyResearch(myTree);

//        myTree.printToConsole(myTree);
//        myTree.printToConsoleWithIterator(myTree);
        myTree.printToConsoleWithIterator2(myTree);

        var allChildrenOfMitya = research.findRelatives("Mitya", Relation.CHILD);
        System.out.println(allChildrenOfMitya.toString());

        research.findSiblings();
        var allSistersOfIgor = research.findRelatives("Igor", Relation.SISTER);
        System.out.println(allSistersOfIgor);


    }
}



