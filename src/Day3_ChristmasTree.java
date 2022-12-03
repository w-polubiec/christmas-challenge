import java.util.stream.IntStream;

/**
 * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
 * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
 * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
 * Jeżeli potrafisz, nie wpisuj drzewka bezposrednio w printy - pokombinuj z pętlami.
 * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
 * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
 */
public class Day3_ChristmasTree {

    private StringBuilder builder;
    private final int height;

    public Day3_ChristmasTree(int height) {
        this.height = height;
        builder = new StringBuilder();
    }

    private void printSpaces(int row, StringBuilder builder) {
        int spaces = height - (row + 1);
        IntStream.range(0, spaces).forEach((i) -> builder.append(" "));
    }

    private void printStars(int row, StringBuilder builder) {
        int stars = row * 2 + 1;
        IntStream.range(0, stars).forEach((i) -> builder.append("*"));
    }

    private void buildRow(int row) {
        printSpaces(row, builder);
        printStars(row, builder);
        builder.append(System.lineSeparator());
    }

    public void print() {
        IntStream.range(0, height).forEach(this::buildRow);
        System.out.print(builder.toString());
    }


    public static void main(String[] args) {

        int height = 15;
        // TODO: prepare function which draw christmas tree;

        Day3_ChristmasTree tree = new Day3_ChristmasTree(height);
        tree.print();

    }
}