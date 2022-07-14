package GenTreeProject;

public class Person {

    String name;
    String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name;
    }

}
