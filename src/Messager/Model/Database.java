package Messager.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Database {
    HashMap<String, ArrayList<String>> db = new HashMap<>();

    default void addMsgToDatabase(String name, String msg){
        db.get(name).add(msg);
    }

    default void printDatabase(){
        for (Map.Entry<String, ArrayList<String>> entry : db.entrySet()) {
            String name = entry.getKey();
            ArrayList<String> msgs = entry.getValue();
            System.out.println(">>> Messages of " + name + ":");
            System.out.println(msgs.toString());
        }
    }
}
