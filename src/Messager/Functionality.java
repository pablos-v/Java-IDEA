package Messager;

public class Functionality {

    public static void base(ICQ icq) {
        User client1 = new SimpleUser("Vaso", icq);
        User client2 = new SimpleUser("Lisa", icq);
        User client3 = new SimpleUser("Mimi", icq);
        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client3);
        client1.sendMessage("Privet!");
        client2.sendMessage("Zdravi bude!");
        User client4 = new SimpleUser("Nona", icq);
        icq.appendClient(client4);
        client4.sendMessage("Vot i YA!");
        System.out.println();
    }

    public static void deletion(ICQ icq) {
        System.out.println(icq.users);
        Admin newAdmin = new Admin("Moderator", icq);
        // Сначала хотел скастовать в Админа одного из юзеров:
        // Admin newAdmin = (Admin)icq.users.get(1);
        // но ловлю ClassCastException
        // не подскажете как сменить юзеру тип на админа и наоборот?
        icq.appendClient(newAdmin);
        newAdmin.delete(icq.users.get(0));
        System.out.println(icq.users);
    }

    public static void extra(ICQ icq) {

    }
}
