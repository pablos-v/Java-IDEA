package GenTreeProject;

public class TreeBuilder extends GenTree{
    public GenTree build(GenTree buildingTree){
        Person Mitya = new Person("Mitya", "m");
        Person Nina = new Person("Nina", "w");
        Person Igor = new Person("Igor", "m");
        Person Kolya = new Person("Kolya", "m");
        Person Larisa = new Person("Larisa", "w");

        buildingTree.addNode(Mitya,Nina);
        buildingTree.addNode(Mitya,Igor);
        buildingTree.addNode(Igor,Kolya);
        buildingTree.addNode(Nina,Larisa);

        return buildingTree;
    }
}
