package MyPlanner;

import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Database implements Printer {

    public TreeMap<Integer, List<String>> map;

    public Database() {
        map = new TreeMap<>();
    }

    public void add(List<String> ls) {
        map.put(Integer.parseInt(ls.get(0)), ls.subList(1, ls.size()));
    }
}
