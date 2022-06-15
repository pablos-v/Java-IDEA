public class HorseMove {
    static int[][] board = new int[5][5];

    public static void main(String[] args) {
        // form array of moves
        HorseMoveRec(2, 2, 1);
        // print it
        printIt(board);
    }

    private static void printIt(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static void HorseMoveRec(int row, int col, int counter) {
        if (counter == board.length * board[0].length) {
            return;
        }
        if (row > 0 && row < board.length && col > 0 && col < board[0].length) {
            if (board[row][col] == 0) {
                board[row][col] = counter++;
                HorseMoveRec(row - 1, col - 2, counter);
                HorseMoveRec(row - 2, col - 1, counter);
                HorseMoveRec(row - 2, col + 1, counter);
                HorseMoveRec(row - 1, col + 2, counter);
                HorseMoveRec(row + 1, col + 2, counter);
                HorseMoveRec(row + 2, col + 1, counter);
                HorseMoveRec(row + 2, col - 1, counter);
                HorseMoveRec(row + 1, col - 2, counter);
            }
        }
    }
}


//    Ну смотри.. сколько у тебя максимум возможных ходов коня от любой позиции?
//        8
//        Перебираешь их по кругу, к примеру, и проверяешь, что:
//        а) место в пределах доски
//        б) еще не использовалось
//        если так, то идешь на него, и передаешь это место как первоначальное этой же функции .
//        Если нет - рассматриваешь следующее место.
//        А если такого нет, возвращаяешься выше (то есть на пред. ход)
//        и начинается все с самого начала.