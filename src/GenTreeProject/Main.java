package GenTreeProject;

public class Main {
    public static void main(String[] args) {

        GenTree myTree = new TreeBuilder().build();
        Research research = new Research(myTree);

        myTree.print();

        var allChildrenOfMitya = research.findRelatives("Mitya", Relation.CHILD);
        System.out.println(allChildrenOfMitya.toString());

        research.findSiblings();
        var allSistersOfIgor = research.findRelatives("Igor", Relation.SISTER);
        System.out.println(allSistersOfIgor);
    }
}



