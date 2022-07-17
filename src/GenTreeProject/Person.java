package GenTreeProject;

public class Person {

    private String name;
    private Gender gender;

    private int generationPriority = 0;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setGenerationPriority(int priority) {
        this.generationPriority = priority;
    }
}
