package eggFactory;

import eggs.ChickenEgg;
import eggs.OstrichEgg;
import eggs.DinosaurEgg;

import java.util.Random;

public class EggFactory {
    private Random random = new Random();

    public Egg createEgg() {
        int type = random.nextInt(3);
        switch (type) {
            case 0: return new ChickenEgg();
            case 1: return new OstrichEgg();
            case 2: return new DinosaurEgg();
            default: return new ChickenEgg(); // it's actually a painted rock in this case
        }
    }
}