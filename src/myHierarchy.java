//Создать свою иерархию классов отражающую иерархию некоторой организации,
//        Например: менеджер - начальник отдела - директор. Описать характеристики (состояние и поведение) для каждого из участников
//        Далее сценарий
//        В некоторой организации необходимо разработать программу взаимодействия с клиентами в которой можно просмотреть данные клиента.
//        У менеджера нет прав для изменения или просмотра некоторых данных. Создайте класс, в котором будут содержаться следующие поля:
//
//        - ФИО
//        - Дата рождения
//        - Номер паспорта
//
//        Менеджер не имеет доступа к просмотру паспорта. Вместо данных паспорта он видит символы: «...», — если поле не пустое.
//        Менеджер не может изменять поля «Фамилия», «Имя», «Отчество», но может их просматривать.
//        Консультант может изменить «Номер телефона», но при этом поле должно быть всегда заполнено.
//
//        Продумать возможность изменения данных при повышении уровня доступа
public class myHierarchy {
    public static void main(String[] args) {
        Person vasya = new Person("Vasya ", 22, "");
        Person yura = new Manager("Yura ", 41, " 4563 5478");
        TeamLead igor = new TeamLead("Igor ", 43, " 0987 3546");
        Person lida = new ChiefOfficer("Lida ", 27, " 7541 2587");
// manager
        System.out.println(yura.getName(vasya) + yura.getAge(vasya) + yura.getPassport(vasya));
        yura.setAge(vasya, 20);
        yura.setName(vasya, "tyu");
        System.out.println(yura.getAge(vasya));
// customer
        System.out.println(vasya.getName(igor));
// teamLead
        igor.setPassport(vasya, " 3456 864");
        System.out.println(igor.getPassport(vasya));
        igor.setPassport(vasya, "");
// CEO
        System.out.println(lida.getName(igor) + lida.getAge(igor) + lida.getPassport(igor));
    }
}
