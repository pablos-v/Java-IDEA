import java.util.ArrayDeque;

public class Wave {

    public static int[][] mapGenerator(int value) {

        int[][] map1 = {
                {1, 0, -1},
                {0, 0, 0},
                {-1, 0, 0},

        };
        int[][] map2 = {
                {1, -1, -1, -1, -1, -1},
                {0, 0, 0, 0, -1, 0},
                {-1, 0, 0, 0, 0, 0},
                {-1, 0, -1, 0, -1, 0},
                {-1, 0, 0, 0, -1, 0},
                {-1, 0, 0, 0, -1, 0}
        };
        return value == 1 ? map1 : map2;
    }

    public static class WaveAlgorithm {
        int[][] map;
        int[][] movesArray = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        public WaveAlgorithm(int[][] map) {
            this.map = map;
        }

        public boolean pointInMap(int x, int y) {
            return x <= map[0].length - 1 && x >= 0 && y >= 0 && y <= map.length - 1;
        }

        public void Find() {
            var q = new ArrayDeque<>();
            int[] startPoint = {0, 0};
            q.add(startPoint);
            while (!q.isEmpty()) {
                startPoint = (int[]) q.poll();
                for (int i = 0; i < 4; i++) {
                    int x = startPoint[0] + movesArray[i][0];
                    int y = startPoint[1] + movesArray[i][1];
                    if (pointInMap(x, y) && map[x][y] == 0) {
                        map[x][y] = map[startPoint[1]][startPoint[0]] + 1;
                        q.add(new int[]{y, x});
                    }
                }
            }
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WaveAlgorithm wave = new WaveAlgorithm(mapGenerator(2));
        wave.Find();
        System.out.println(wave.map[wave.map.length - 1][wave.map[0].length - 1]);
        print(wave.map);
    }
}
