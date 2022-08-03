package Messager;

import java.util.ArrayList;
import java.util.Objects;

public class ICQ implements Chat {
    String chatName;
    ArrayList<User> users;

    public ICQ(String n) {
        chatName = n;
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String text, User me) {
        System.out.printf("\n>>> Chat %s see: ", chatName);
        for (User user : users) {
            if (!Objects.equals(user.name, me.name)) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User client) {
        System.out.printf("\n>>> %s entering %s", client.name, chatName);
        users.add(client);
    }
}
