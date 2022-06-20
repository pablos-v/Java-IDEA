import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Passanger {
    int timeIn;
    int timeOut;
    int total;
    String stIn;
    String stOut;

    public Passanger(int t, String stIn) {
        this.timeIn = t;
        this.stIn = stIn;
    }
}

class UndergroundSystem {
    Map<Integer, Passanger> map = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        Passanger pas = new Passanger(t, stationName);
        map.put(id, pas);

    }

    public void checkOut(int id, String stationName, int t) {
        map.get(id).timeOut = t;
        map.get(id).stOut = stationName;
        map.get(id).total = map.get(id).timeOut - map.get(id).timeIn;
    }

    public double getAverageTime(String startStation, String endStation) {
        double res = 0;
        int count = 0;
        for (Integer id : map.keySet()) {
            if (Objects.equals(map.get(id).stIn, startStation) && Objects.equals(map.get(id).stOut, endStation)) {
                res += map.get(id).total;
                count++;
            }
        }
        return res / count;
    }
}

/** Клиентский код:

 public class Main {
 public static void main(String[] args) {
 UndergroundSystem us = new UndergroundSystem();
 us.checkIn(45,"Leyton",3);
 us.checkIn(32,"Paradise",8);
 us.checkIn(27,"Leyton",10);
 us.checkOut(45,"Waterloo",15);
 us.checkOut(27,"Waterloo",20);
 us.checkOut(32,"Cambridge",22);
 System.out.println(us.getAverageTime("Paradise","Cambridge"));
 System.out.println(us.getAverageTime("Leyton","Waterloo"));
 us.checkIn(10,"Leyton",24);
 System.out.println(us.getAverageTime("Leyton","Waterloo"));
 us.checkOut(10,"Waterloo",38);
 System.out.println(us.getAverageTime("Leyton","Waterloo"));

 }
 }

 */