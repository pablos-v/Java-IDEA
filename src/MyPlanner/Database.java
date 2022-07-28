package MyPlanner;

import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Database implements Printer{

    public TreeMap<Integer, List<String>> map;

    public Database() {
        map = new TreeMap<>();
    }

    public void add(List<String> ls) {
        int key = !map.isEmpty() ? map.lastKey() + 1 : 0;
        map.put(key, ls);
        // пример записи
        // id: task, dateTimeAdded, Priority, Name
    }

}
