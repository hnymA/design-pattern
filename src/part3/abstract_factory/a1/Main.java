package part3.abstract_factory.a1;

import part3.abstract_factory.a1.factory.Factory;
import part3.abstract_factory.a1.factory.Link;
import part3.abstract_factory.a1.factory.Page;
import part3.abstract_factory.a1.factory.Tray;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
        }
        Factory factory = Factory.getFactory(args[0]);
        Page page = factory.createYahooPage();
        page.output();
    }
}
