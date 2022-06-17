package Lesson_07.Ex007;

public class Healer extends Magician {
    public Healer() {
    }
    public void Heal(BaseHero target) {
        int hp = BaseHero.r.nextInt(10, 20);
        target.healed(hp);
    }
}
