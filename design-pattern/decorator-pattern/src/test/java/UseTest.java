import org.junit.Test;
import use.*;

import java.text.NumberFormat;

/**
 * @author yeobi Created 2020-03-11
 */
public class UseTest {

    @Test
    public void noUseTest() {
        System.out.println("데코레이터 패턴 적용");
        // BLT, 베이컨, 치즈
        Sandwich sandwichBlt = new Blt();
        sandwichBlt = new Bacon(sandwichBlt);
        sandwichBlt = new Cheese(sandwichBlt);
        System.out.println(sandwichBlt.getDescription() + " - ₩" + NumberFormat.getInstance().format(sandwichBlt.cost()));

        // 비프, 토마토
        Sandwich sandwichBeef = new Beef();
        sandwichBeef = new Tomato(sandwichBeef);
        System.out.println(sandwichBeef.getDescription() + " - ₩" + NumberFormat.getInstance().format(sandwichBeef.cost()));

        // 치킨, 햄, 토마토
        Sandwich sandwichChicken = new Chicken();
        sandwichChicken = new Ham(sandwichChicken);
        sandwichChicken = new Tomato(sandwichChicken);
        System.out.println(sandwichChicken.getDescription() + " - ₩" + NumberFormat.getInstance().format(sandwichChicken.cost()));

        System.out.println();
    }

}
