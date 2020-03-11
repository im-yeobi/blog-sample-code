package common;

/**
 * @author yeobi Created 2020-03-11
 */
public enum Menu {

    BLT("BLT 샌드위치", 4_500),
    BEEF("비프 샌드위치", 5_000),
    CHICKEN("치킨 샌드위치", 4_000);

    private String name;
    private int cost;

    Menu(String name, int cost) {
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
