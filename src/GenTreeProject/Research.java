//package GenTreeProject;
//
//import java.util.ArrayList;
//
//public class Research {
//
//    public Research(TreeBuilder) {
//    }
//
//    public ArrayList<Person> findRelatives(Person researchPerson, Relation researchRelation) {
//        ArrayList<Person> result = new ArrayList<>();
//        tree.forEach(node -> {
//            if (node.getFirstPerson().getName().equals(researchPerson.getName()) && node.getRelation() == researchRelation) {
//                result.add(node.getSecondPerson());
//            }
//        });
//        return result;
//    }
//
//    public void findSiblings() {
//        int len = tree.size();
//        for (int j = 0; j < len; j++) {
//            for (int i = 1; i < len; i++) {
//                if (tree.get(i).equals(tree.get(j))) continue;
//                //if parent`s name is same
//                if (tree.get(j).getSecondPerson().getName().equals(tree.get(i).getSecondPerson().getName()) && tree.get(j).getRelation().equals(Relation.PARENT) && tree.get(i).getRelation().equals(Relation.PARENT)) {
//                    tree.add(new Node(tree.get(j).getFirstPerson(), tree.get(i).getFirstPerson(), tree.get(i).getFirstPerson().getSex().equals("w") ? Relation.SISTER : Relation.BROTHER));
//                    tree.add(new Node(tree.get(i).getFirstPerson(), tree.get(j).getFirstPerson(), tree.get(j).getFirstPerson().getSex().equals("w") ? Relation.SISTER : Relation.BROTHER));
//                }
//            }
//        }
//    }
//}
