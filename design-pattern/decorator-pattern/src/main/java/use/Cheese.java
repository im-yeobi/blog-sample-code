package use;

import common.Topping;

/**
 * @author yeobi Created 2020-03-11
 */
public class Cheese extends SandwichTopping {

    private Sandwich sandwich;

    public Cheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", " + Topping.CHEESE.getName();
    }

    @Override
    public int cost() {
        return sandwich.cost() + Topping.CHEESE.getCost();
    }

}
