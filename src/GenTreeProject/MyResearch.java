package GenTreeProject;

import java.util.ArrayList;

public class MyResearch implements Research {
    private GenTree genealogy;

    public MyResearch(GenTree genealogy) {
        this.genealogy = genealogy;
    }

    @Override
    public ArrayList<Person> findRelatives(String researchPerson, Relation researchRelation) {
        ArrayList<Person> result = new ArrayList<>();
        genealogy.getTree().forEach(node -> {
            if (node.getFirstPerson().getName().equals(researchPerson) && node.getRelation() == researchRelation) {
                result.add(node.getSecondPerson());
            }
        });
        return result;
    }

    @Override
    public void findSiblings() {
        var tree = genealogy.getTree();
        int len = tree.size();
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len; i++) {
                //if parent`s name is same
                String parentOfFirstPerson = tree.get(j).getSecondPerson().getName();
                String parentOfSecondPerson = tree.get(i).getSecondPerson().getName();
                if (isParent(j) && isParent(i) && parentOfFirstPerson.equals(parentOfSecondPerson)) {
                    Person firstSibling = tree.get(j).getFirstPerson();
                    Person secondSibling = tree.get(i).getFirstPerson();
                    tree.add(new Node(firstSibling, secondSibling, setRelation(secondSibling)));
                    tree.add(new Node(secondSibling, firstSibling, setRelation(firstSibling)));
                }
            }
        }
    }

    private boolean isParent(int n) {
        return genealogy.getTree().get(n).getRelation().equals(Relation.PARENT);
    }

    private Relation setRelation(Person person) {
        return person.getGender().equals(Gender.FEMALE) ? Relation.SISTER : Relation.BROTHER;
    }
}
