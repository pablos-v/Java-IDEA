package GenTreeProject;

import java.util.ArrayList;

public class TreeBuilder {
    GenTree build(GenTree buildingTree) {
        buildingTree.setTree(new ArrayList<>());

        Person Mitya = new Person("Mitya", "m");
        Person Nina = new Person("Nina", "w");
        Person Igor = new Person("Igor", "m");
        Person Kolya = new Person("Kolya", "m");
        Person Larisa = new Person("Larisa", "w");

        buildingTree.addNode(Mitya, Nina);
        buildingTree.addNode(Mitya, Igor);
        buildingTree.addNode(Igor, Kolya);
        buildingTree.addNode(Nina, Larisa);

        return buildingTree;
    }
}
