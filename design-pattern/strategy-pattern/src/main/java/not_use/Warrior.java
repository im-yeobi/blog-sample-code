package not_use;

/**
 * @author yeobi Created 2020-02-12
 */
public class Warrior extends Unit {

    @Override
    public void role() {
        System.out.println("전사");
    }

    @Override
    public void attack() {
        System.out.println("근거리 공격");
    }

}
