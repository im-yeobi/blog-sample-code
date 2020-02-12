package use;

/**
 * @author yeobi Created 2020-02-12
 * @description 전략 패턴 사용한 경우
 */
public class StrategyPatternMain {

    public static void main(String[] args) {
        Unit warrior = new Warrior(new ShortAttack());
        warrior.role();
        warrior.move();
        warrior.attack();
        System.out.println();

        Unit archer = new Archer(new LongAttack());
        archer.role();
        archer.move();
        archer.attack();
        System.out.println();

        Unit wizard = new Wizard(new LongAttack());
        wizard.role();
        wizard.move();
        wizard.attack();
        System.out.println();

        // 런타임에 전략을 바꿔보자
        System.out.println("전사 공격 전략 변경");
        warrior.setAttackable(new ShortAndLongAttack());
        warrior.role();
        warrior.move();
        warrior.attack();
    }

}
