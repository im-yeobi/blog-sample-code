import no_use.Beef;
import no_use.Blt;
import no_use.Chicken;
import no_use.Sandwich;
import org.junit.Test;

import java.text.NumberFormat;

/**
 * @author yeobi Created 2020-03-11
 */
public class NoUseTest {

    @Test
    public void noUseTest() {
        System.out.println("데코레이터 패턴 미적용");
        // BLT, 베이컨, 치즈
        Sandwich sandwichBlt = new Blt();
        sandwichBlt.setBacon();
        sandwichBlt.setCheese();
        System.out.println(sandwichBlt.getDescription() + " - ₩" + NumberFormat.getInstance().format(sandwichBlt.cost()));

        // 비프, 토마토
        Sandwich sandwichBeef = new Beef();
        sandwichBeef.setTomato();
        System.out.println(sandwichBeef.getDescription() + " - ₩" + NumberFormat.getInstance().format(sandwichBeef.cost()));

        // 치킨, 햄, 토마토
        Sandwich sandwichChicken = new Chicken();
        sandwichChicken.setHam();
        sandwichChicken.setTomato();
        System.out.println(sandwichChicken.getDescription() + " - ₩" + NumberFormat.getInstance().format(sandwichChicken.cost()));

        System.out.println();
    }

}
