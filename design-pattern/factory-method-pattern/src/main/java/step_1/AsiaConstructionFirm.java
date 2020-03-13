package step_1;

import common.AsiaStyleHospital;
import common.AsiaStyleUniversity;
import common.Building;
import common.BuildingType;

/**
 * @author yeobi Created 2020-03-13
 */
public class AsiaConstructionFirm extends ConstructionFirm {

    @Override
    public Building requestBuild(BuildingType type) {
        Building building = null;
        switch (type) {
            case HOSPITAL:
                building = new AsiaStyleHospital();
                break;
            case UNIVERSITY:
                building = new AsiaStyleUniversity();
                break;
        }

        building.design();
        building.build();
        building.finish();

        return building;
    }

}
