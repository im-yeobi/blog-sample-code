package not_use;

/**
 * @author yeobi Created 2020-02-12
 * @description 전략 패턴 사용하지 않은 경우
 */
public class StrategyPatternMain {

    public static void main(String[] args) {
        Unit warrior = new Warrior();
        warrior.role();
        warrior.move();
        warrior.attack();
        System.out.println();

        Unit archer = new Archer();
        archer.role();
        archer.move();
        archer.attack();
        System.out.println();

        Unit wizard = new Wizard();
        wizard.role();
        wizard.move();
        wizard.attack();
    }

}
