import model.Box;

import java.text.DecimalFormat;

public class Day22_GiftBoxRibbon {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Mikołaj zapakował prezenty w pudełka i papier i chce jeszcze obwiązać je wstążką.
     * Ma 5 pudełek o wielkości 10cmx13cmx15cm.
     * Oblicz i wypisz na ekranie, ile metrów wstążki musi kupić Mikołaj.
     * Załóż, że dla każdego prezentu musi kupić tyle wstążki,
     * żeby obwiązać prezent oddzielnie z dwóch stron + dla każdej strony mieć zapas 50%.
     * Niech wstązka krzyzuje sie na sciance o największej powierzchni.
     */

    public static void main(String[] args) {
        Box box = new Box(10, 13, 15);
        int boxesAmount = 5;

        //TODO: calculate how many meters of ribbon Santa needs to buy

        System.out.println("Santa needs " + df.format(calculateRibbonMeters(boxesAmount, box)) + " meters of ribbon");
    }

    private static double calculateRibbonMeters(int boxesAmount, Box box) {

        double x = box.getX() * 0.01;
        double y = box.getY() * 0.01;
        double z = box.getZ() * 0.01;
        double additionalRibbon = 1.5;

        double oneBoxRibbon = additionalRibbon * ((2 * (x + y)) + (2 * (x + z)));

        return boxesAmount * oneBoxRibbon;
    }
}
