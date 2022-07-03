import java.util.ArrayDeque;

class Solution {
    static class Node {
        int x, y, distance;

        Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int maxX = mat.length;
        int maxY = mat[0].length;
        int[][] res = new int[maxX][maxY];
        ArrayDeque<Node> queue = new ArrayDeque<>();
        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < maxY; y++) {
                if (mat[x][y] == 0) queue.add(new Node(x, y, 0));
                else res[x][y] = -1;
            }
        }
        int[][] moves = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        while (!queue.isEmpty()) {
            Node actual = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = actual.x + moves[i][0];
                int y = actual.y + moves[i][1];
                if (x >= 0 && x < maxX && y >= 0 && y < maxY && res[x][y] == -1) {
                    queue.add(new Node(x, y, actual.distance + 1));
                    res[x][y] = actual.distance + 1;
                }
            }
        }
        return res;
    }
}