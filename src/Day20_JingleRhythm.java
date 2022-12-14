import java.awt.*;

public class Day20_JingleRhythm {
    /**
     * Świąteczne piosenki to coś co lubimy wszyscy. Niektórzy lubią ich słuchać, ale niektorzy także grać na pianinie!
     * Przygotuj symulator rytmu piosenki Jingle Bells. W tablicy poniżej znajdziesz długości kolejnych nut.
     * Na terminalu wypisuj kolejne gwiazdki dla każdej nuty przez określony długością nuty czas.
     * Przykładowo 300ms * czas określony dla nuty w tablicy. Dla efektu dźwiękowego możesz też użyć beep!
     */

    public static final int SOUND_CONSTANT_MILISECONDS = 200;

    public static void main(String[] args) {

        int[] tones = {
                2, 2, 4, 2, 2, 4, 2, 2, 2, 1, 8, 2, 2, 2, 1, 2, 2, 2, 1, 1,
                2, 2, 2, 2, 4, 4, 2, 2, 4, 2, 2, 4, 2, 2, 2, 1, 8, 2, 2, 2, 1,
                2, 2, 2, 1, 1, 2, 2, 2, 2, 8, 2, 2, 2, 2, 4, 1, 1, 2, 2, 2, 2, 8,
                2, 2, 2, 2, 8, 2, 2, 2, 2, 8, 2, 2, 2, 2, 8,
                2, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8
        };

        // TODO: Show star for as long as tone in table, to make better effect use "beep" function

        for (int i = 0; i < tones.length; i++) {
            Toolkit.getDefaultToolkit().beep();
            System.out.print("*");
            try {
                Thread.sleep(SOUND_CONSTANT_MILISECONDS * tones[i]);
                System.out.print(" ");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}