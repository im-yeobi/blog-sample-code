package step_2;

import common.Building;
import common.BuildingType;

/**
 * @author yeobi Created 2020-03-13
 * 외부 팩토리
 */
public abstract class ConstructionFirm {

    public abstract Building requestBuild(BuildingType type);

}
