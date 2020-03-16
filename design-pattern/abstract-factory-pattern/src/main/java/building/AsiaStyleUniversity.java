package building;

import materials.BuildingMaterialsFactory;

/**
 * @author yeobi Created 2020-03-16
 */
public class AsiaStyleUniversity extends Building {

    private BuildingMaterialsFactory materialsFactory;

    public AsiaStyleUniversity(BuildingMaterialsFactory materialsFactory) {
        this.materialsFactory = materialsFactory;
        super.name = "아시아 스타일 대학 건물";
    }

    @Override
    public void buildFoundation() {
        System.out.println("기초 공사");
        // 팩토리에게 자재 생성 요청
        super.cement = materialsFactory.createCement();
        super.wood = materialsFactory.createWood();
    }

}
