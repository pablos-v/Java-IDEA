package HOmeWork;

public abstract class AbsClient {

    protected String name = "";
    public double getDiscount(int price) {
        return price * 0.95;
    }
}
