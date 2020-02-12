package use;

/**
 * @author yeobi Created 2020-02-12
 */
public abstract class Unit {

    protected Attackable attackable;

    public abstract void role();

    public void move() {
        System.out.println("이동");
    }

    public void attack() {
        attackable.attack();
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

}
