package HOmeWork;

public class VIPClient extends SuperClient implements Name{
    @Override
    public double getDiscount(int price) {
        return price * 0.8;
    }
}
