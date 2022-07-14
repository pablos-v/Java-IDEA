package GenTreeProject;

class Node {
    Person firstPerson;
    Person secondPerson;
    Relation relation;

    public Node(Person one, Person two, Relation rel) {
        this.firstPerson = one;
        this.secondPerson = two;
        this.relation = rel;
    }
}
