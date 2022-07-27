package MyPlanner;

interface Doc {
    void start(StringBuilder sb);

    void add(StringBuilder sb, String item);

    void end(StringBuilder sb);
}
