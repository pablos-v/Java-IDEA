package bridge_pattern;

public interface Coder {
    default void writeCode() {
        System.out.println(this.getClass().getSimpleName() + " wrights code!");
    }
}
