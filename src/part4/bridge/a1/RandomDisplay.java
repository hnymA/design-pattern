package part4.bridge.a1;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(times); i++) {
            print();
        }
        close();
    }
}
