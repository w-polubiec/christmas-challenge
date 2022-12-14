import model.ChildWithBirthDate;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Day16_FindOldestAndYoungest {
    /**
     * Mikołaj przygotował dodatkowe prezenty dla najmłodszego i najstarszego dziecka.
     * Pomóż mu znaleźć je w liście.
     * Wypisz na ekran znalezione dzieci wraz z informacja, które jest najstarsze, a które najmłodsze.
     */

    public static void main(String[] args) {

        List<ChildWithBirthDate> children = prepareChildren();

        // TODO: show youngest and oldest child


        Optional<ChildWithBirthDate> minDate = children.stream().min(Comparator.comparing(ChildWithBirthDate::getDateOfBirth));
        System.out.println("Najstarsze dziecko to: " + minDate.get());

        Optional<ChildWithBirthDate> maxDate = children.stream().max(Comparator.comparing(ChildWithBirthDate::getDateOfBirth));
        System.out.println("Najmłodsze dziecko to: " + maxDate.get());


    }

    private static List<ChildWithBirthDate> prepareChildren() {
        return List.of(
                new ChildWithBirthDate(
                        "Jasiu",
                        "Kowalski",
                        LocalDate.of(2010, 12, 30)
                ),
                new ChildWithBirthDate(
                        "Kasia",
                        "Nowak",
                        LocalDate.of(2011, 11, 30)),
                new ChildWithBirthDate(
                        "Asia",
                        "Wisniewska",
                        LocalDate.of(2010, 12, 31)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Wojcik",
                        LocalDate.of(2015, 6, 30)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Zajac",
                        LocalDate.of(2020, 12, 30))
        );
    }
}
