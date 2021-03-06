package step_2;

import common.Building;
import common.BuildingType;

/**
 * @author yeobi Created 2020-03-13
 * 유럽 건설사
 */
public class EuropeConstructionFirm extends ConstructionFirm {

    @Override
    public Building requestBuild(BuildingType type) {
        Building building = null;

        // 변경된 부분. 외부 팩토리에 인스턴스 생성 요청
        building = EuropeStyleBuildingFactory.getBuildingInstance(type);

        building.design();
        building.build();
        building.finish();

        return building;
    }

}
