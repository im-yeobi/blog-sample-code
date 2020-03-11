package use;

/**
 * @author yeobi Created 2020-03-11
 */
public abstract class Sandwich {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();

}
