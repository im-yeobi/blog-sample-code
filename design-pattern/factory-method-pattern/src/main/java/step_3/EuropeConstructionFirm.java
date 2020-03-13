package step_3;

import common.Building;
import common.BuildingType;
import common.EuropeStyleHospital;
import common.EuropeStyleUniversity;

/**
 * @author yeobi Created 2020-03-13
 * 유럽 건설사
 */
public class EuropeConstructionFirm extends ConstructionFirm {

    @Override
    public Building getBuildingInstance(BuildingType type) {
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
