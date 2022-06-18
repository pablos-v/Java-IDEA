public class TeamLead extends Person{

    public TeamLead(String name, int age, String passport){
        super(name,age,passport);
        super.role = "TeamLead";
        super.accessLevel = 2;
    }


    // get FIO
    // get age
    // get pasp

    //set FIO
    // set age
    // set pasp но при этом поле должно быть всегда заполнено
}
