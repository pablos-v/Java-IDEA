package HomeWork;

import java.io.*;
import java.util.ArrayList;

public class SaveLoadModule {
    private ArrayList<ObjectInputStream> savedGames;

    public SaveLoadModule() {
        savedGames = new ArrayList<>();
    }

    public void save(Parameters game) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);
        ous.writeObject(game);
        ous.close();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        savedGames.add(ois);
    }

    public Parameters load(int id) throws IOException, ClassNotFoundException {
        return (Parameters) savedGames.get(id).readObject();
    }

}
