package part4.bridge.a2;

public class Main {

    public static void main(String[] args) {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("src/part4/bridge/a2/star.txt"));
        d.multiDisplay(3);
    }
}
