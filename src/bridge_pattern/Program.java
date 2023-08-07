package bridge_pattern;

public abstract class Program {
    protected Coder coder;

    protected Program(Coder coder) {
        this.coder = coder;
    }

    public void developProgram() {
        System.out.println(this.getClass().getSimpleName() + " development started!");
        coder.writeCode();
    }
}
