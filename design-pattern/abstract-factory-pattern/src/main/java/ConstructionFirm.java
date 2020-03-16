import building.Building;
import building.BuildingType;

/**
 * @author yeobi Created 2020-03-16
 * 팩토리 메소드 패턴
 */
public abstract class ConstructionFirm {

    public Building requestBuild(BuildingType type) {
        Building building = null;

        // 서브 클래스가 인스턴스 생성 결정
        building = this.getBuildingInstance(type);

        building.buildFoundation();
        building.design();
        building.build();
        building.finish();

        return building;
    }

    // 팩토리 메소드
    public abstract Building getBuildingInstance(BuildingType type);

}
