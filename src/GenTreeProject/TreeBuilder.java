package GenTreeProject;

public class TreeBuilder implements GenTree{
    TreeBuilder build() {

        Person Mitya = new Person("Mitya", "m");
        Person Nina = new Person("Nina", "w");
        Person Igor = new Person("Igor", "m");
        Person Kolya = new Person("Kolya", "m");
        Person Larisa = new Person("Larisa", "w");

        this.addNode(Mitya, Nina);
        this.addNode(Mitya, Igor);
        this.addNode(Igor, Kolya);
        this.addNode(Nina, Larisa);

        return this;
    }
}
