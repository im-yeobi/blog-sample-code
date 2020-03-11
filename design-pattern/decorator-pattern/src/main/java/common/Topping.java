package common;

/**
 * @author yeobi Created 2020-03-11
 */
public enum Topping {

    HAM("햄", 800),
    BACON("베이컨", 1_000),
    CHEESE("치즈", 800),
    TOMATO("토마토", 500);

    private String name;
    private int cost;

    Topping(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

}
