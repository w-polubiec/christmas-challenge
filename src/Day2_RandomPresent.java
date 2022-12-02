import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
 * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
 * Pomoż Mikołajowi!
 * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
 * Odpal program kilka razy - sprawdź, czy na pewno losuje za kazdym razem inne prezenty!
 * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
 */
public class Day2_RandomPresent {

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Perfume", "Socks", "Sweater", "Cup",
                "Hat", "Tea", "Coffee", "Clock", "Bag",
                "Book", "Wallet", "Cream", "Earrings");

        List<String> list = new ArrayList<>(ideas); // mutable List from immutable List

        final int numberOfPresents = 3;

        Random random = new Random();

        for (int i = 0; i < numberOfPresents; i++) {
            int index = random.nextInt(list.size());
            String present = list.get(index);
            System.out.println(present);
            list.remove(index);
        }
    }
}