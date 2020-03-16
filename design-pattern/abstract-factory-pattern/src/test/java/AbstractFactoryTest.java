import building.Building;
import building.BuildingType;
import org.junit.Test;

/**
 * @author yeobi Created 2020-03-16
 */
public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest() {
        ConstructionFirm asiaConstructionFirm = new AsiaConstructionFirm();
        Building asiaHospital = asiaConstructionFirm.requestBuild(BuildingType.HOSPITAL);
        System.out.println(asiaHospital + "\n");

        Building asiaUniversity = asiaConstructionFirm.requestBuild(BuildingType.UNIVERSITY);
        System.out.println(asiaUniversity + "\n");

        ConstructionFirm europeConstructionFirm = new EuropeConstructionFirm();
        Building europeHospital = europeConstructionFirm.requestBuild(BuildingType.HOSPITAL);
        System.out.println(europeHospital + "\n");

        Building europeUniversity = europeConstructionFirm.requestBuild(BuildingType.UNIVERSITY);
        System.out.println(europeUniversity);
    }

}
