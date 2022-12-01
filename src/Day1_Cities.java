/**
 * Wyzwanie Świąteczne @wswieciekodu
 * Dzień 1
 * Mikołaj musi odwiedzić 3 miasta o współrzędnych (1,1), (4,5), (11,5) w podanej kolejności.
 * Mikołaj startuje z punktu(1,1) spod stacji paliw ;)
 * Na 10 jednostek odległości jego sanie zużywają 20 litrów magicznego paliwa.
 * Ile paliwa potrzebuje na całą trasę? Do policzenia przygotuj odpowiedni kod.
 * Obliczony wynik wypisz na ekranie.
 * <p>
 * Oblicz w kodzie dystans miedzy miastami, a nastepnie policz niezbedną ilosc paliwa.
 * Do obliczenia dystansu przygotuj odpowiednią funkcję.
 * Do obliczeń matematycznych użyj funkcji z biblioteki Twojego jezyka.
 */
public class Day1_Cities {

    public static final int SLEIGH_CONSUMPTION = 20 / 10;

    private static double calcDistBetween2Points(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    private static double calcDistanceBetween3Points(Point point1, Point point2, Point point3) {
        return calcDistBetween2Points(point1, point2) + calcDistBetween2Points(point2, point3);
    }

    private static double calcNeededPetrol(Point p1, Point p2, Point p3) {
        return SLEIGH_CONSUMPTION * calcDistanceBetween3Points(p1, p2, p3);
    }

    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(11, 5);

        double neededPetrol = calcNeededPetrol(p1, p2, p3);

        System.out.println("Paliwo potrzebne do pokonania całej trasy składającej się z " + p1 + p2 + p3 + " to: " + neededPetrol);
    }


}