package step_3;

import common.AsiaStyleHospital;
import common.AsiaStyleUniversity;
import common.Building;
import common.BuildingType;

/**
 * @author yeobi Created 2020-03-13
 * 아시아 건설사
 */
public class AsiaConstructionFirm extends ConstructionFirm {

    @Override
    public Building getBuildingInstance(BuildingType type) {
        Building building = null;
        // 객체 생성부
        switch (type) {
            case HOSPITAL:
                building = new AsiaStyleHospital();
                break;
            case UNIVERSITY:
                building = new AsiaStyleUniversity();
                break;
        }

        return building;
    }

}
