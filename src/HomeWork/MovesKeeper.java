package HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class MovesKeeper {
    private LinkedHashMap<Integer, String> moves;

    public MovesKeeper() {
        moves = new LinkedHashMap<>();
    }

    public void addMove(Integer move, String position) {
        moves.put(move, position);
    }

    public void print() {
        for (Map.Entry<Integer, String> entry : moves.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
