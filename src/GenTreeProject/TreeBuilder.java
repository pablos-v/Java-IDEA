package GenTreeProject;

public class TreeBuilder extends GenTree {
    @Override
    public GenTree build() {
        this.index = 0;
        this.indexNext = 0;

        Person Mitya = new Person("Mitya", Gender.MALE);
        Person Nina = new Person("Nina", Gender.FEMALE);
        Person Igor = new Person("Igor", Gender.MALE);
        Person Kolya = new Person("Kolya", Gender.MALE);
        Person Larisa = new Person("Larisa", Gender.FEMALE);

        this.addNode(Mitya, Nina);
        this.addNode(Mitya, Igor);
        this.addNode(Igor, Kolya);
        this.addNode(Nina, Larisa);

        return this;
    }
}
