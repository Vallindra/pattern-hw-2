import singleton.EasterBunny;

import java.util.Scanner;

public class EasterEggApp {
    public static void main(String[] args) {
        EasterBunny bunny = EasterBunny.getInstance();
        int eggCount;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of eggs to hide");
        eggCount = read.nextInt();
        System.out.println("Preparing and hiding " + eggCount + " Easter eggs:");
        bunny.prepareAndHideEggs(eggCount);

    }
}