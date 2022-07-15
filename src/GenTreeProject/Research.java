package GenTreeProject;

import java.util.ArrayList;

interface Research {

    ArrayList<Person> findRelatives(String researchPerson, Relation researchRelation) ;

    void findSiblings();
}
