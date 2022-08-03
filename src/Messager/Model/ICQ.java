package Messager.Model;

import Messager.Infrastructure.Users.User;


import java.util.ArrayList;
import java.util.Objects;

public class ICQ implements Chat {
    String chatName;
    public ArrayList<User> users;

    public ICQ(String n) {
        chatName = n;
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String text, User me) {
        myView.viewOutput(String.format("\n>>> Chat %s see: ", chatName));
        for (User user : users) {
            if (!Objects.equals(user.name, me.name)) {
                myView.viewOutput(String.format("\n    %s: %s", user.name, text));
            }
        }
    }

    @Override
    public void appendClient(User client) {
        myView.viewOutput(String.format("\n>>> %s entering chat %s", client.name, chatName));
        users.add(client);
    }

    @Override
    public void deleteClient(User client) {
        myView.viewOutput(String.format("\n>>> %s is kicked from %s\n", client.name, chatName));
        users.remove(client);
    }

}
