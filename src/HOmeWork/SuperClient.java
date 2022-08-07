package HOmeWork;

public class SuperClient extends Client implements Name{
    @Override
    public double getDiscount(int price) {
        return price * 0.85;
    }
}
