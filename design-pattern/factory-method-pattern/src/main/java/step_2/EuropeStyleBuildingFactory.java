package step_2;

import common.Building;
import common.BuildingType;
import common.EuropeStyleHospital;
import common.EuropeStyleUniversity;

/**
 * @author yeobi Created 2020-03-13
 * 유럽 빌딩 건축 방식 팩토리
 */
public class EuropeStyleBuildingFactory {

    public static Building getBuildingInstance(BuildingType type) {
        Building building = null;
        // 객체 생성부
        switch (type) {
            case HOSPITAL:
                building = new EuropeStyleHospital();
                break;
            case UNIVERSITY:
                building = new EuropeStyleUniversity();
                break;
        }

        return building;
    }

}
