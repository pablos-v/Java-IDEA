package MyPlanner;

import java.util.ArrayList;
import java.util.SortedMap;

public class Database {

    public SortedMap<Integer, ArrayList<String>> map;

    public void add(ArrayList<String> ls) {
        int key = !map.isEmpty() ? map.lastKey() + 1 : 0;
        map.put(key, ls);
        // пример записи
        // id: task, dateTimeAdded, deadLine, Name
    }

    public void countPriority() {
        // deadLine - currentTime
    }
}
