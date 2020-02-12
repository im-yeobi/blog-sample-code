package not_use;

/**
 * @author yeobi Created 2020-02-12
 */
public class Wizard extends Unit {

    @Override
    public void role() {
        System.out.println("마법사");
    }

    @Override
    public void attack() {
        // 메소드 중복 발생
        System.out.println("원거리 공격");
    }

}
