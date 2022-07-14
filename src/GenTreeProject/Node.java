package GenTreeProject;

class Node {
    private Person firstPerson;
    private Person secondPerson;
    private Relation relation;

    public Node(Person one, Person two, Relation rel) {
        this.firstPerson = one;
        this.secondPerson = two;
        this.relation = rel;
    }

    public Person getFirstPerson() {
        return firstPerson;
    }

    public Person getSecondPerson() {
        return secondPerson;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setFirstPerson(Person firstPerson) {
        this.firstPerson = firstPerson;
    }

    public void setSecondPerson(Person secondPerson) {
        this.secondPerson = secondPerson;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }
}
