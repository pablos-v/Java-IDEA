package Messager.Infrastructure.Users;

import Messager.Model.Chat;

public class Bot extends User{
    public Bot(String name, Chat room) {
        super(name, room);
    }

    public void someBotFunction(){
        System.out.println("Coming soon...");
    }
}
