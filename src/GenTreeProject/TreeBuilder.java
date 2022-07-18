package GenTreeProject;

public class TreeBuilder extends GenTree {
    @Override
    public GenTree build() {
        this.index = 0;
        this.indexNext = 0;

        Person Mitya = new Person("Mitya", Gender.MALE, 0);
        Person Nina = new Person("Nina", Gender.FEMALE, 1);
        Person Igor = new Person("Igor", Gender.MALE, 1);
        Person Kolya = new Person("Kolya", Gender.MALE, 2);
        Person Larisa = new Person("Larisa", Gender.FEMALE, 2);

        this.addNode(Mitya, Nina);
        this.addNode(Mitya, Igor);
        this.addNode(Igor, Kolya);
        this.addNode(Nina, Larisa);

        return this;
    }
}
