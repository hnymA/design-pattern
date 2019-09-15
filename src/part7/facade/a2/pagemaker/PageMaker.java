package part7.facade.a2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import javax.xml.crypto.Data;

public class PageMaker {

    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HTMLWriter writer = new HTMLWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "のぺーじへようこそ。");
            writer.paragraph("メールまっていますね。");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void makeLinkPage(String filename) {
        try {
            HTMLWriter writer = new HTMLWriter(new FileWriter(filename));
            writer.title("Link Page");
            Properties mailprop = Database.getProperties("maildata");
            Enumeration en = mailprop.propertyNames();

            while (en.hasMoreElements()) {
                String mailaddr = (String) en.nextElement();
                String username = mailprop.getProperty(mailaddr, "(unknown)");
                writer.mailto(mailaddr, username);
            }

            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
