import java.util.*;

public class Day14_SplitPresentsList {

    /**
     * Lista prezentów od dzieci przychodzi w jednym długim napisie.
     * Napis zawiera dane w formacie: imię dziecka, spacja, prezenty rozdzielone spacjami, przecinek.
     * Pomóż Mikołajowi! Podziel napis na ciągi: imię dziecka => prezenty po przecinku.
     * Po ostatnim prezencie w linii nie powinno byc przecinka.
     */

    public static void main(String[] args) {

        String giftsList = "Kuba klocki klawiatura dron quad, Alicja komputer samochod mysz, "
                + "Janina ksiazka traktor, Tomek kuchenka koparka flamastry, ";

        // TODO: Split string and print children name => gifts in one line

        List<String> list = new ArrayList<>(List.of(giftsList.split(", ")));

        Map<String, List<String>> map = new HashMap<>();

        for (String element : list) {
            List<String> innerList = new ArrayList<>(List.of(element.split(" ")));
            String key = innerList.get(0);
            innerList.remove(0);
            map.put(key, innerList);
        }
        map.forEach((key, value) -> System.out.println(key + " => " + value));

    }
}