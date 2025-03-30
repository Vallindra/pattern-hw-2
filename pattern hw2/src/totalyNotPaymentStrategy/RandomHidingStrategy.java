package totalyNotPaymentStrategy;

import eggFactory.Egg;

import java.util.Random;

public class RandomHidingStrategy implements HidingStrategy {
    private Random random = new Random();

    @Override
    public void hideEgg(Egg egg) {
        int location = random.nextInt(3);
        String place;
        switch (location) {
            case 0: place = "in a basket"; break;
            case 1: place = "in the forest"; break;
            case 2: place = "under a bush"; break;
            default: place = "IN ORBIT AROUND NEPTUNE?!?!?!??!"; break;
        }
        System.out.println("The Easter Bunny hid a " + egg.getType() + " " + place);
    }
}
