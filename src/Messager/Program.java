package Messager;

public class Program {
    public static void main(String[] args) {
        ICQ icq = new ICQ("\"balabol\"");
        User client1 = new User("Vaso", icq);
        User client2 = new User("Lisa", icq);
        User client3 = new User("Mimi", icq);
        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client3);
        client1.sendMessage("Privet!");
        client2.sendMessage("Zdravi bude!");
        User client4 = new User("Nona", icq);
        icq.appendClient(client4);
        client4.sendMessage("Vot i YA!");

    }
}
