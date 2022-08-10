package HomeWork;

import java.io.Serializable;

public class Game implements Serializable {
    private String map;
    private int players;
    private String parameters;

    MovesKeeper movesFlow;

    private Integer move;

    public Game(String map, int players, String parameters) {
        this.map = map;
        this.players = players;
        this.parameters = parameters;
        move = 1;
        movesFlow = new MovesKeeper();
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

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public void makeMove(String position) {
        movesFlow.addMove(move++, position);
    }
}
