package Messager.Model;

import Messager.Infrastructure.Users.User;
import Messager.MyView;

public interface Chat {

    MyView myView = new MyView();

    void sendMessage(String msg, User user);

    void appendClient(User user);

    void deleteClient(User user);
}
