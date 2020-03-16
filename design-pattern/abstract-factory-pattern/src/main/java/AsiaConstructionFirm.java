import building.AsiaStyleHospital;
import building.AsiaStyleUniversity;
import building.Building;
import building.BuildingType;
import materials.AsiaMaterialsFactory;
import materials.BuildingMaterialsFactory;

/**
 * @author yeobi Created 2020-03-16
 * 아시아 건설사
 */
public class AsiaConstructionFirm extends ConstructionFirm {

    @Override
    public Building getBuildingInstance(BuildingType type) {
        Building building = null;

        // 자재 생성을 위한 팩토리
        BuildingMaterialsFactory materialsFactory = new AsiaMaterialsFactory();

        // 객체 생성부
        switch (type) {
            case HOSPITAL:
                building = new AsiaStyleHospital(materialsFactory);
                break;
            case UNIVERSITY:
                building = new AsiaStyleUniversity(materialsFactory);
                break;
        }

        return building;
    }

}
