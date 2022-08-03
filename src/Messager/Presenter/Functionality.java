package Messager.Presenter;

import Messager.Infrastructure.Users.Admin;
import Messager.Infrastructure.Users.Bot;
import Messager.Infrastructure.Users.SimpleUser;
import Messager.Infrastructure.Users.User;
import Messager.Model.ICQ;

public class Functionality {

    public static void basic(ICQ icq) {
        User client1 = new Bot("Bot_nice", icq);
        User client2 = new SimpleUser("Lisa", icq);
        User client3 = new SimpleUser("Mimi", icq);
        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client3);
        client1.sendMessage("SPAM");
        client2.sendMessage("Zovite moderatora!");
        client1.sendMessage("Ne nado");
        User client4 = new SimpleUser("Nona", icq);
        icq.appendClient(client4);
        client4.sendMessage("Privet!");
        System.out.println("\n---------------------");
    }

    public static void deletion(ICQ icq) {
        System.out.println(icq.users);
        Admin newAdmin = new Admin("Moderator", icq);
        // Сначала хотел скастовать в Админа одного из юзеров:
        // Admin newAdmin = (Admin)icq.users.get(1);
        // но ловлю ClassCastException. Читал про апкасты, понимания не пришло
        // не подскажете как сменить юзеру тип на админа и наоборот?
        icq.appendClient(newAdmin);
        newAdmin.delete(icq.users.get(0));
        System.out.println(icq.users);
        System.out.println("---------------------");
    }

    public static void database(ICQ icq) {
        icq.printDatabase();
    }
}
