package GenTreeProject;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private Gender gender;

    private int generation = 0;

    public Person(String name, Gender gender, int generation) {
        this.name = name;
        this.gender = gender;
        this.generation = generation;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getGeneration() {
        return generation;
    }

    public void setName(String name) {
        this.name = name;
    }

    // сортировка по старшинству поколений
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.generation, o.generation);
    }
}
