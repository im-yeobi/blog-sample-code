package common;

/**
 * @author yeobi Created 2020-03-13
 */
public abstract class Building {

    protected String name;

    public String toString() {
        return name;
    }

    public void design() {
        System.out.println("건물 설계하기");
    }

    public void build() {
        System.out.println("건물 짓기");
    }

    public void finish() {
        System.out.println("공사 마무리하기");
    }

}
