package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            var intSquare = Math.round(circle.getSquare());
            System.out.printf("%d%n", intSquare);
        }
        catch (NegativeRadiusException nre) {
            System.out.println("Не удалось посчитать площадь");
        }
        catch (Exception ex) {
            
        }
        finally {
            System.out.println("Вычисление окончено");
        }
    }
}

// END
