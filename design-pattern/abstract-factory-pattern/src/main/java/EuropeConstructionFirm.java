import building.Building;
import building.BuildingType;
import building.EuropeStyleHospital;
import building.EuropeStyleUniversity;
import materials.BuildingMaterialsFactory;
import materials.EuropeMaterialsFactory;

/**
 * @author yeobi Created 2020-03-16
 * 유럽 건설사
 */
public class EuropeConstructionFirm extends ConstructionFirm {

    @Override
    public Building getBuildingInstance(BuildingType type) {
        Building building = null;

        // 자재 생성을 위한 팩토리
        BuildingMaterialsFactory materialsFactory = new EuropeMaterialsFactory();

        // 객체 생성부
        switch (type) {
            case HOSPITAL:
                building = new EuropeStyleHospital(materialsFactory);
                break;
            case UNIVERSITY:
                building = new EuropeStyleUniversity(materialsFactory);
                break;
        }

        return building;
    }

}
