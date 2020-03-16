package materials;

/**
 * @author yeobi Created 2020-03-16
 */
public class AsiaMaterialsFactory implements BuildingMaterialsFactory {

    @Override
    public Cement createCement() {
        return new PortlandCement();
    }

    @Override
    public Wood createWood() {
        return new OakWood();
    }

}
