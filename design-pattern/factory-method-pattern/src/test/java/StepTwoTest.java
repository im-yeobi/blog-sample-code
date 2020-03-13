import common.Building;
import common.BuildingType;
import org.junit.Test;
import step_2.AsiaConstructionFirm;
import step_2.ConstructionFirm;
import step_2.EuropeConstructionFirm;

/**
 * @author yeobi Created 2020-03-13
 */
public class StepTwoTest {

    /**
     * 2 단계. 객체 생성을 외부 팩토리에서 처리
     */
    @Test
    public void setTwoTest() {
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
