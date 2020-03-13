package step_1;

import common.Building;
import common.BuildingType;
import common.EuropeStyleHospital;
import common.EuropeStyleUniversity;

/**
 * @author yeobi Created 2020-03-13
 */
public class EuropeConstructionFirm extends ConstructionFirm {

    @Override
    public Building requestBuild(BuildingType type) {
        Building building = null;
        switch (type) {
            case HOSPITAL:
                building = new EuropeStyleHospital();
                break;
            case UNIVERSITY:
                building = new EuropeStyleUniversity();
                break;
        }

        building.design();
        building.build();
        building.finish();

        return building;
    }

}
