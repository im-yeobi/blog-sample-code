import common.Building;
import common.BuildingType;
import org.junit.Test;
import step_1.*;

/**
 * @author yeobi Created 2020-03-13
 */
public class StepOneTest {

    /**
     * 1 단계. 객체 생성부 미분리
     */
    @Test
    public void stepOneTest() {
        // 아시아 스타일 병원 건물 짓기
        ConstructionFirm asiaConstructionFirm = new AsiaConstructionFirm();
        Building asiaHospital = asiaConstructionFirm.requestBuild(BuildingType.HOSPITAL);
        System.out.println(asiaHospital.toString());

        System.out.println();

        // 유럽 스타일 대학 건물 짓기
        ConstructionFirm constructionFirm = new EuropeConstructionFirm();
        Building europeUniversity = constructionFirm.requestBuild(BuildingType.UNIVERSITY);
        System.out.println(europeUniversity.toString());
    }

}
