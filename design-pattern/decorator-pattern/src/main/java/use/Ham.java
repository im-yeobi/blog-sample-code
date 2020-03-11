package use;

import common.Topping;

/**
 * @author yeobi Created 2020-03-11
 */
public class Ham extends SandwichTopping {

    private Sandwich sandwich;

    public Ham(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", " + Topping.HAM.getName();
    }

    @Override
    public int cost() {
        return sandwich.cost() + Topping.HAM.getCost();
    }

}
