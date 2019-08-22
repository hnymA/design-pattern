package part4.bridge.a3;

public class Main {

    public static void main(String[] args) {
        IncreseDisplay d1 = new IncreseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreseDisplay d2 = new IncreseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }
}
