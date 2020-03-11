package no_use;

import common.Menu;

/**
 * @author yeobi Created 2020-03-11
 */
public class Chicken extends Sandwich {

    public Chicken() {
        super.description = Menu.CHICKEN.getName();
    }

    @Override
    public int cost() {
        return super.cost() + Menu.CHICKEN.getCost();
    }

}
