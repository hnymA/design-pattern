package part2.factory_method.a2;

import part2.factory_method.a2.framework.Factory;
import part2.factory_method.a2.framework.Product;
import part2.factory_method.a2.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("結城浩");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
    }
}
