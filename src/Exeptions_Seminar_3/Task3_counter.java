package Exeptions_Seminar_3;

public class Task3_counter implements AutoCloseable {

    private int i = 0;
    private static boolean closed = false;

    public void add() {
        if (!closed) {
            this.i++;
        } else throw new RuntimeException("!!!!!!");
    }

    @Override
    public void close() throws Exception {
        closed = true;
    }
}
