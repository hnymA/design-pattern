package part2.factory_method.a2.idcard;

import java.util.HashMap;
import part2.factory_method.a2.framework.Factory;
import part2.factory_method.a2.framework.Product;

public class IDCardFactory extends Factory {

    private int serial = 0;
    private HashMap<String, Integer> database = new HashMap<>();

    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getOwner(), card.getSerial());
    }

    public int getSerial() {
        return serial;
    }

    public HashMap<String, Integer> getDatabase() {
        return database;
    }
}
