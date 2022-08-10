package HomeWork;

import java.io.*;
import java.util.ArrayList;

public class SaveLoadModule {
    private ArrayList<ObjectInputStream> savedGames;

    public SaveLoadModule() {
        savedGames = new ArrayList<>();
    }

    public void save(Game game) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);
        ous.writeObject(game);
        ous.close();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        savedGames.add(ois);
    }

    public Game load(int id) throws IOException, ClassNotFoundException {
        return (Game) savedGames.get(id).readObject();
    }

}
