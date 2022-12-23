public class Day23_ChristmasBow {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie kokardkę na choinkę.
     * Jeżeli potrafisz, nie wpisuj kokardki bezpośrednio w printy - pokombinuj z pętlami.
     * Tak, żeby kokardka wygenerowała się sama!
     */

    public static void main(String[] args) {

        int height = 15;

        // TODO: draw bow
        drawABow(height);

    }

    private static void drawABow(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || j == i || j == height - i) {
                    System.out.print("*");
                } else if (j > i && j < height - i) {
                    System.out.print(" ");
                } else if (i < j || j < height - i) {
                    System.out.print(ANSI_RED + "*" + ANSI_RESET);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
