public class Manager extends Person{

    public Manager(String name, int age, String passport){
        super(name,age,passport);
        super.role = "manager";
        super.accessLevel = 1;
    }

    //get pasp Вместо данных паспорта он видит символы: «...», — если поле не пустое
    //get FIO Менеджер не может изменять поля «Фамилия», «Имя», «Отчество», но может их просматривать.
    // get age

    // set age

}
