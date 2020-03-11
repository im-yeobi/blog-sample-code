package use;

import common.Menu;

/**
 * @author yeobi Created 2020-03-11
 */
public class Beef extends Sandwich {

    public Beef() {
        super.description = Menu.BEEF.getName();
    }

    public int cost() {
        return Menu.BEEF.getCost();
    }

}
