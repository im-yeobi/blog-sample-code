package use;

/**
 * @author yeobi Created 2020-02-12
 */
public class Wizard extends Unit {

    public Wizard(Attackable attackable) {
        super.attackable = attackable;
    }

    @Override
    public void role() {
        System.out.println("마법사");
    }

}
