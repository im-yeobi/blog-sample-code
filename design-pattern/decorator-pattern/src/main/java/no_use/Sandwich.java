package no_use;

import common.Topping;

/**
 * @author yeobi Created 2020-03-11
 */
public abstract class Sandwich {

    protected String description;
    private boolean ham;
    private boolean bacon;
    private boolean cheese;
    private boolean tomato;

    public String getDescription() {
        return description;
    }

    public int cost() {
        int toppingCost = 0;
        if (ham) {
            toppingCost += Topping.HAM.getCost();
        }
        if (bacon) {
            toppingCost += Topping.BACON.getCost();
        }
        if (cheese) {
            toppingCost += Topping.CHEESE.getCost();
        }
        if (tomato) {
            toppingCost += Topping.TOMATO.getCost();
        }

        return toppingCost;
    }

    // setter
    public void setHam() {
        ham = !ham;
    }

    public void setBacon() {
        bacon = !bacon;
    }

    public void setCheese() {
        cheese = !cheese;
    }

    public void setTomato() {
        tomato = !tomato;
    }

}
