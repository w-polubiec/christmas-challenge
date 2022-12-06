import model.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mikolaj postanowil przygotować w tym roku potrawy swiateczne samodzielnie.
 * Dostał od mamy listę przepisów, dzieki którym stworzy pyszne, tradycyjne potrawy!
 * Ale najpierw musi pójść na zakupy. Pomoż Mikołajowi i wygeneruj listę zakupów z listy przepisów.
 * Dla ułatwienia załóż, że wszystkie produkty są w tych samych jednostkach, wiec po prostu podlicz ilości.
 * P.S. Nie polecam używać tych przepisów, zostały one maksymalnie uproszone do celu zadania. :D
 */
public class Day6_ShoppingList {
    public static void main(String[] args) {
        List<Recipe> recipes = prepareRecipes();
        Day6_ShoppingList day6 = new Day6_ShoppingList();
        Map<String, Integer> shoppingList = day6.prepareShoppingList(recipes);
        System.out.println(shoppingList);
    }

    private Map<String, Integer> prepareShoppingList(List<Recipe> recipes) {
        Map<String, Integer> shoppingList = new HashMap<>();

        for (int i = 0; i < recipes.size(); i++) {
            for (String ingredientKey : recipes.get(i).getIngredients().keySet()) {
                Integer valueToAdd = recipes.get(i).getIngredients().get(ingredientKey);
                if (!shoppingList.containsKey(ingredientKey)) {
                    shoppingList.put(ingredientKey, valueToAdd);
                } else {
                    int existingValue = shoppingList.get(ingredientKey);
                    int summedValue = existingValue + valueToAdd;
                    shoppingList.replace(ingredientKey, existingValue, summedValue);
                }
            }
        }
        return shoppingList;
    }

    private static List<Recipe> prepareRecipes() {
        return List.of(
                new Recipe(
                        "Murzynek",
                        Map.of(
                                "Maka", 300,
                                "Cukier", 100,
                                "Jajka", 3,
                                "Czekolada", 200,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Piernik",
                        Map.of(
                                "Maka", 500,
                                "Cukier", 180,
                                "Miod", 250,
                                "Jajka", 1,
                                "Mleko", 80,
                                "Maslo", 150
                        ),
                        "Piekarnik nagrzać do temp. 180 stopni [...]"),
                new Recipe(
                        "Sernik",
                        Map.of(
                                "Maka", 100,
                                "Cukier", 200,
                                "Jajka", 6,
                                "Ser", 1000,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Uszka",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Sol", 1,
                                "Maslo", 200,
                                "Grzyby", 150,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Barszcz",
                        Map.of(
                                "Buraki", 1000,
                                "Bulion", 1500,
                                "Zakwas", 200,
                                "Sol", 1
                        ),
                        "Buraki rozdrobnić i zagotować z bulionem [...]"),
                new Recipe(
                        "Pierogi",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Kapusta", 500,
                                "Grzyby", 50,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Karp",
                        Map.of(
                                "Karp", 1000,
                                "Maka", 50,
                                "Mleko", 500,
                                "Sol", 1,
                                "Olej", 500
                        ),
                        "Rybę umyć i pokroić w dzwonki [...]")
        );
    }
}
