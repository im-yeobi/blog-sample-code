package use;

/**
 * @author yeobi Created 2020-02-12
 */
public class Warrior extends Unit {

    public Warrior(Attackable attackable) {
        super.attackable = attackable;
    }

    @Override
    public void role() {
        System.out.println("전사");
    }

}
