public class Person {
    private String name;
    private int age;
    private String passport;
    public String role;
    public int accessLevel;

    public Person(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.role = "customer";
        this.accessLevel = 0;
    }

    public Person() {
        this("Sample_name", 22, "123456");
    }

    protected String getName(Person person) {
        return this.accessLevel > 0 ? person.name : "Access denied!";
    }

    protected String getPassport(Person person) {
        if (this.accessLevel == 0) return "Forbidden!";
        if (this.accessLevel == 1) {
            return !person.passport.isEmpty() ? "..." : "";
        } else return person.passport;
    }

    protected int getAge(Person person) {
        return this.accessLevel > 0 ? person.age : -1;
    }

    protected void setName(Person person, String newName){
        if (this.accessLevel > 1){
            person.name = newName;
        }
        else System.out.println("NO access!");
    }

    protected void setAge(Person person, int newAge){
        if (this.accessLevel > 0){
            person.age = newAge;
        }
        else System.out.println("No access!");
    }

    protected void setPassport(Person person, String newPass){
        if (this.accessLevel == 3) person.passport = newPass;
        if (this.accessLevel ==2){
            if(newPass.isEmpty()) System.out.println("This field can not be empty!");
            else person.passport = newPass;
        }
        else System.out.println("No access!");
    }

}
