package use;

import common.Menu;

/**
 * @author yeobi Created 2020-03-11
 */
public class Blt extends Sandwich {

    public Blt() {
        super.description = Menu.BLT.getName();
    }

    public int cost() {
        return Menu.BLT.getCost();
    }

}
