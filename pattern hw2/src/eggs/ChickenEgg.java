package eggs;

import eggFactory.Egg;

import java.util.Random;

public class ChickenEgg implements Egg {
    private String decoration;
    private Random random = new Random();

    @Override
    public void decorate() {
        int decorationType = random.nextInt(2);
        if (decorationType == 0) {
            decoration = "painted";
        } else {
            decoration = "stickered";
        }
    }

    @Override
    public String getType() {
        return decoration + " chicken egg";
    }
}
