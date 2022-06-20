

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