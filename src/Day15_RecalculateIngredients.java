import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.PI;

public class Day15_RecalculateIngredients {

    private static final double WIDTH = 20.0;
    private static final double LENGTH = 30.0;
    private static final double DIAMETER = 9.8;


    /**
     * Mama przesłała Mikołajowi przepisy na ciasta. Blacha mamy Mikołaja jest prostokątna i ma wymiary 20cm x 30cm.
     * Mikołaj ma blachę okrągłą o średnicy 9.8 cm.
     * Pomóż Mikołajowi przeliczuć składniki przepisu na jego blaszkę.
     * Przygotuj funkcję, która będzie przyjmować 2 wymiary blaszki prostokątnej oraz średnicę okrąglej
     * i dla podanej listy składników dla prostokątnej przeliczy ich ilość dla okrągłej.
     * Dla uproszczenia nie przejmuj się jednostkami i załóż, że formy mają taką samą wysokość.
     */
    public static void main(String[] args) {

        Map<String, Integer> ingredientsForRectangleForm = Map.of(
                "Maka", 300,
                "Cukier", 100,
                "Jajka", 4,
                "Czekolada", 200,
                "Maslo", 200
        );

        // TODO: prepare function which calculate amount of ingredients for circle form

        System.out.println("ingredients for circle form:");
        System.out.println(calculationForCircleForm(ingredientsForRectangleForm));

    }

    private static double rectangleField(double a, double b) {
        return a * b;
    }

    private static double circleField(double diameter) {
        return PI * Math.pow(diameter / 2, 2);
    }

    private static double coefficientCalc(double rectA, double rectB, double diameter) {
        return rectangleField(rectA, rectB) / circleField(diameter);
    }

    private static Map<String, BigDecimal> calculationForCircleForm(Map<String, Integer> inputMap) {
        Map<String, BigDecimal> ingredientsForCircleForm = new HashMap<>();
        inputMap.forEach((key, value) -> ingredientsForCircleForm
                .put(key, new BigDecimal(value / coefficientCalc(WIDTH, LENGTH, DIAMETER)).setScale(0, RoundingMode.HALF_UP)));

        return ingredientsForCircleForm;
    }
}
