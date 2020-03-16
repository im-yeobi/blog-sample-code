package materials;

/**
 * @author yeobi Created 2020-03-16
 */
public class EuropeMaterialsFactory implements BuildingMaterialsFactory {

    @Override
    public Cement createCement() {
        return new MixtureCement();
    }

    @Override
    public Wood createWood() {
        return new WalnutWood();
    }

}
