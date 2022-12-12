import model.Address;
import model.ChildWithAddress;

import java.util.List;

/**
 * Pomóż Mikołajowi przygotować etykiety do druku na prezenty!
 * Dla każdego dziecka z listy wypisz w konsoli imię, nazwisko i adres w formacie jak na list.
 * Rozdziel przygotowane etykiety liniami.
 */

public class Day12_PrintLabels {

    public static void main(String[] args) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        List<ChildWithAddress> children = prepareChildren();

        // TODO: Print labels

        children.forEach(child -> {

            String firstLine = child.getName() + " " + child.getSurname();
            String secondLine = child.getAddress().getStreet() + " " + child.getAddress().getNumber();
            String thirdLine = child.getAddress().getZipCode() + " " + child.getAddress().getCity();

            int labelWidth = Math.max(Math.max(firstLine.length(), secondLine.length()), thirdLine.length());

            System.out.println(" " + ANSI_RED + "-".repeat(labelWidth));
            System.out.printf("|" + ANSI_RESET + "%" + labelWidth + "s" + ANSI_RED + "|%n", firstLine);
            System.out.printf("|" + ANSI_RESET + "%" + labelWidth + "s" + ANSI_RED + "|%n", secondLine);
            System.out.printf("|" + ANSI_RESET + "%" + labelWidth + "s" + ANSI_RED + "|%n", thirdLine);
            System.out.println(" " + ANSI_RED + "-".repeat(labelWidth));
        });
    }

    private static List<ChildWithAddress> prepareChildren() {
        return List.of(
                new ChildWithAddress(
                        "Jasiu",
                        "Kowalski",
                        new Address("Serniczkowa",
                                "4B",
                                2,
                                "Krakow",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Kasia",
                        "Nowak",
                        new Address("Pierniczkoooooowaaaaaa",
                                "289",
                                55,
                                "Gdansk",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Asia",
                        "Wisniewska",
                        new Address("Barszczykowa",
                                "234",
                                5,
                                "Rzeszow",
                                "37-326"
                        )),
                new ChildWithAddress(
                        "Tomek",
                        "Wojcik",
                        new Address("Uszkowa",
                                "43H",
                                5,
                                "Wroclaw",
                                "02-326"
                        ))
        );
    }
}

