import common.Building;
import common.BuildingType;
import org.junit.Test;
import step_3.AsiaConstructionFirm;
import step_3.ConstructionFirm;
import step_3.EuropeConstructionFirm;

/**
 * @author yeobi Created 2020-03-13
 */
public class StepThreeTest {

    /**
     * 3 단계. 서브 클래스에서 객체 생성 결정
     */
    @Test
    public void stepThreeTest() {
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
