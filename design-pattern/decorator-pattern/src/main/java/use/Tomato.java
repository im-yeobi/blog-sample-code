package use;

import common.Topping;

/**
 * @author yeobi Created 2020-03-11
 */
public class Tomato extends SandwichTopping {

    private Sandwich sandwich;

    public Tomato(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + ", " + Topping.TOMATO.getName();
    }

    @Override
    public int cost() {
        return sandwich.cost() + Topping.TOMATO.getCost();
    }

}
