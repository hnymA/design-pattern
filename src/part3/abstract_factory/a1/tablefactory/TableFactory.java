package part3.abstract_factory.a1.tablefactory;

import part3.abstract_factory.a1.factory.Factory;
import part3.abstract_factory.a1.factory.Link;
import part3.abstract_factory.a1.factory.Page;
import part3.abstract_factory.a1.factory.Tray;

public class TableFactory extends Factory {

    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
