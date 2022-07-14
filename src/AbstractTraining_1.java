public abstract class AbstractTraining_1 {
    int nnn;

    private int secret;

    public void foo(){
        System.out.println("foo abstract");
    }

    public AbstractTraining_1() {
        this.nnn = 5;
        this.secret = 100;
    }

    public int getSecret() {
        return secret;
    }
}
