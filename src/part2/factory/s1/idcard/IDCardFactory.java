package part2.factory.s1.idcard;

import java.util.ArrayList;
import java.util.List;
import part2.factory.s1.framework.Factory;
import part2.factory.s1.framework.Product;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
