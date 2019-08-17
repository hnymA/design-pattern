package part3.abstract_factory.a1.listfactory;

import part3.abstract_factory.a1.factory.Factory;
import part3.abstract_factory.a1.factory.Link;
import part3.abstract_factory.a1.factory.Page;
import part3.abstract_factory.a1.factory.Tray;

public class ListFactory extends Factory {

    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
