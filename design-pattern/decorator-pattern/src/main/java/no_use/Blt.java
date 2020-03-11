package no_use;

import common.Menu;

/**
 * @author yeobi Created 2020-03-11
 */
public class Blt extends Sandwich {

    public Blt() {
        super.description = Menu.BLT.getName();
    }

    @Override
    public int cost() {
        return super.cost() + Menu.BLT.getCost();
    }

}
