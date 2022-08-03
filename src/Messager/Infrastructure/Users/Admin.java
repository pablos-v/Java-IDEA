package Messager.Infrastructure.Users;

import Messager.Model.Chat;

import java.util.Objects;

public class Admin extends User{

    public Admin(String name, Chat room) {
        super(name, room);
    }

    public void delete(User user){
        if(!Objects.equals(user.name, this.name)){
            room.deleteClient(user);
        }
        else System.out.println("You can't cut the branch you're sitting on)");
    }
}
