package MyPlanner;

import java.util.List;
import java.util.SortedMap;

public class Database {

    public SortedMap<Integer, List<String>> map;

    public void add(List<String> ls) {
        int key = !map.isEmpty() ? map.lastKey() + 1 : 0;
        map.put(key, ls);
        // пример записи
        // id: task, dateTimeAdded, Priority, Name
    }

}
