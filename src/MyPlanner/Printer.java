package MyPlanner;

public interface Printer {

    default void print(Database db) {
        db.map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
