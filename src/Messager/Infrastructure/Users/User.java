package Messager.Infrastructure.Users;

import Messager.Model.Chat;

public abstract class User {
    public String name;
    Chat room;

    public User(String name, Chat room) {
        this.name = name;
        this.room = room;
    }

    public void sendMessage(String text) {
        room.myView.viewOutput(String.format("\n  %s says: %s", name, text));
        room.sendMessage(text, this);
    }

    @Override
    public String toString() {
        return name;
    }
}
