package singleton;

import eggFactory.Egg;
import eggFactory.EggFactory;
import totalyNotPaymentStrategy.HidingStrategy;
import totalyNotPaymentStrategy.RandomHidingStrategy;

public class EasterBunny {
    private static EasterBunny instance;
    private EggFactory eggFactory;
    private HidingStrategy hidingStrategy;

    private EasterBunny() { //connection
        this.eggFactory = new EggFactory();
        this.hidingStrategy = new RandomHidingStrategy();
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public void prepareAndHideEggs(int count) {
        for (int i = 0; i < count; i++) {
            Egg egg = eggFactory.createEgg();
            egg.decorate();
            hidingStrategy.hideEgg(egg);
        }
    }

    public void setHidingStrategy(HidingStrategy strategy) {
        this.hidingStrategy = strategy;
    }
}