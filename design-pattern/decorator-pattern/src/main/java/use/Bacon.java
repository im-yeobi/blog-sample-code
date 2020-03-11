package use;

import common.Topping;

/**
 * @author yeobi Created 2020-03-11
 */
public class Bacon extends SandwichTopping {

    private Sandwich sandwich;

    public Bacon(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", " + Topping.BACON.getName();
    }

    @Override
    public int cost() {
        return sandwich.cost() + Topping.BACON.getCost();
    }

}
