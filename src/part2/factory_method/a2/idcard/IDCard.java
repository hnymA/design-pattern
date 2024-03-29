package part2.factory_method.a2.idcard;

import part2.factory_method.a2.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + "（ID: " + serial + "）のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }

    public void use() {
        System.out.println(owner + "（ID: " + serial + "）のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
