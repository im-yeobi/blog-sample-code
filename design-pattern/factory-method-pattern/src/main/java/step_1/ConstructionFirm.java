package step_1;

import common.Building;
import common.BuildingType;

/**
 * @author yeobi Created 2020-03-13
 * 객체 생성 포함
 */
public abstract class ConstructionFirm {

    public abstract Building requestBuild(BuildingType type);

}
