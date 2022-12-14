public class Day21_SwapValues {

    /**
     * Mikołaj znów przyoszczedził na pakiecie. Tym razem dla ilości zmiennych.
     * Kupił sobie tylko dwie: jedną, żeby zapisać ilość miejsc do odwiedzenia,
     * a drugą, żeby zapisać ilość reniferów.
     * Niestety! W ferworze świątecznych przygotowań pomylił się i przypisał wartości na odwrót!
     * Pomoż Mikołajowi i zamień wartości. Pamiętaj, żeby nie używać żadnych dodatkowych zmiennych!
     * Grozi Mikołajowi za to duża kara pieniężna i gdyby ją otrzymał, nie miał by pieniędzy na prezenty!
     */
    public static void main(String[] args) {
        int places = 10;
        int reindeers = 100;

        System.out.println("Before switch: places = " + places);
        System.out.println("Before switch: reindeers = " + reindeers);

        // TODO: swap values not using any additional variable

        places = places ^ reindeers ^ (reindeers = places);

        System.out.println("After switch: places = " + places);
        System.out.println("After switch: reindeers = " + reindeers);
    }
}