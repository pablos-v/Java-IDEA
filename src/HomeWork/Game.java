package HomeWork;

import java.io.Serializable;

public class Game implements Serializable {

    Parameters params;

    public Game(String map, int players, String parameters) {
        params = new Parameters(map, players, parameters);

    }

    public void makeMove(String position) {
        params.makeMove(position);
    }

}
