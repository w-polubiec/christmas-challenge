/**
 * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
 * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
 * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie laskę cukrową.
 * Jeżeli potrafisz, nie wpisuj laski bezpośrednio w printy - pokombinuj z pętlami.
 * Tak, żeby laska wygenerowała się sama!
 */

public class Day10_ChristmasCandy {

    public static void main(String[] args) {

        int height = 13;

        // TODO: prepare function which draw in console christmas candy
        candyDrawer(height);

    }

    private static int path(int x, int y) {
    //circle math function
        return (int) (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public static void candyDrawer(int height) {
        height -=1;
        int length = height;
        int y = height;
        //upper part
        while (y >= 0) {
            int x = -length;
            while (x <= length) {
                if (path(x, y) == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                x += 1;
            }
            System.out.println();
            y -= 2;
        }
        //below part
        while (y >= -height) {
            int x = -length;
            while (x <= length) {
                if (x == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                x += 1;
            }
            System.out.println();
            y -= 2;
        }
    }
}

