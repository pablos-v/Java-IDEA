package GenTreeProject;

public class Main {
    public static void main(String[] args) {

        GenTree one = new TreeBuilder().build(new GenTree());
        GenTree two = new GenTree().build();
        TreePrinter tp = new TreePrinter(two);
        tp.print();

//        var set1 = myTree.findRelatives(Mitya, Relation.CHILD);
//        System.out.println(set1.toString());
//
//        myTree.findSiblings();
//        var set2 = myTree.findRelatives(Nina, Relation.BROTHER);
//        System.out.println(set2.toString());
//        myTree.printer();
    }

}



