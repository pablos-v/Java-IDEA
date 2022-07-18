package GenTreeProject;

import java.util.Comparator;

public class Compare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getGeneration(), o2.getGeneration());
    }
}
