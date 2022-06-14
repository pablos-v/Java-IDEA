public class Hanoi {
    public static void main(String[] args) {
        hanoiTower(3, "1", "2", "3");
    }

    static void hanoiTower(int discNum, String spike1, String spike2, String spike3) {
        if (discNum == 1) {
            System.out.printf("1 disc from %s to %s%n", spike1, spike2);
            return;
        }
        hanoiTower(discNum - 1, spike1, spike3, spike2);
        System.out.printf("%d disc from %s to %s%n", discNum, spike1, spike2);
        hanoiTower(discNum - 1, spike3, spike2, spike1);
    }
}
