package use;

import common.Menu;

/**
 * @author yeobi Created 2020-03-11
 */
public class Chicken extends Sandwich {

    public Chicken() {
        super.description = Menu.CHICKEN.getName();
    }

    public int cost() {
        return Menu.CHICKEN.getCost();
    }

}
