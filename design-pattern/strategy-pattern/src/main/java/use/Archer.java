package use;

/**
 * @author yeobi Created 2020-02-12
 */
public class Archer extends Unit {

    public Archer(Attackable attackable) {
        super.attackable = attackable;
    }

    @Override
    public void role() {
        System.out.println("궁수");
    }

}
