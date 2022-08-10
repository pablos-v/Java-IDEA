package HomeWork;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game game = new Game("Forest", 5, "3 moves, 2 lives");
        game.makeMove("e2-e4");
        game.makeMove("h2-h4");
        game.movesFlow.print();
        System.out.println("------------------");

        SaveLoadModule gamesStorage = new SaveLoadModule();
        gamesStorage.save(game);

        game.makeMove("1234");
        game.movesFlow.print();
        System.out.println("------------------");

        game = gamesStorage.load(0);
        game.movesFlow.print();
    }
}
