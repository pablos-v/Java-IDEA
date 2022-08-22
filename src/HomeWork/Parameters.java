package HomeWork;

import java.io.Serializable;

public class Parameters implements Serializable {

    private String map;
    private int players;
    private String parameters;

    private Integer move;
    MovesKeeper movesFlow;

    public Parameters(String map, int players, String parameters) {
        this.map = map;
        this.players = players;
        this.parameters = parameters;
        move = 1;
        movesFlow = new MovesKeeper();
    }

    public void makeMove(String position) {
        movesFlow.addMove(move++, position);
    }

    public String getMap() {
        return map;
    }

    public int getPlayers() {
        return players;
    }

    public String getParameters() {
        return parameters;
    }

}
