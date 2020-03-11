package no_use;

import common.Menu;

/**
 * @author yeobi Created 2020-03-11
 */
public class Beef extends Sandwich {

    public Beef() {
        super.description = Menu.BEEF.getName();
    }

    @Override
    public int cost() {
        return super.cost() + Menu.BEEF.getCost();
    }

}
