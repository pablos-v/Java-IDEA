package Messager;

public class User {
    String name;
    private Chat room;

    public User(String name, Chat room) {
        this.name = name;
        this.room = room;
    }

    void printMessage(String msg) {
        System.out.printf("\n    %s: %s", name, msg);
    }

    void sendMessage(String text) {
        System.out.printf("\n  %s says: %s", name, text);
        room.sendMessage(text, this);
    }
}
