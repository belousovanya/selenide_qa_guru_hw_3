public class ExapleHomework {
    public static void main(String[] args) {
        // Математические операторы (int)
        int a = 6;
        int b = 23;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Математические операторы (double)
        double c = 3.5;
        double d = 5.5;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        // Вычисления комбинаций типов данных (int и double)
        System.out.println("a + c = " + (a + c));
        System.out.println("b - d = " + (b - d));
        System.out.println("a * c = " + (a * c));
        System.out.println("b / d = " + (b / d));
        System.out.println("a % c = " + (a % c));


        // Логические операторы
        boolean x = true;
        boolean y = false;

        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y));
        System.out.println("x || y = " + (x || y));

        // Переполнение
        int maxInt = 2147483647; // 2^31−1=2147483647
        System.out.println("Максимальное значение int: " + maxInt);

        int overflowInt = maxInt + 1; // Переполнение
        System.out.println("Результат переполнения int: " + overflowInt); // Ожидаемое значение: -2147483648

        int minInt = -2147483648; // -2^31=-2147483647
        System.out.println("Минимальное значение int: " + minInt);

        int underflowInt = minInt - 1; // Переполнение
        System.out.println("Результат переполнения int: " + underflowInt); // Ожидаемое значение: 2147483647

        double maxDouble = Double.MAX_VALUE; // Максимальное значение double
        System.out.println("Максимальное значение double: " + maxDouble);

        double overflowDouble = maxDouble * 2; // Переполнение
        System.out.println("Результат переполнения double: " + overflowDouble); // Ожидаемое значение: Infinity

        double minDouble = -Double.MAX_VALUE; // Минимальное значение double (отрицательное)
        System.out.println("Минимальное значение double: " + minDouble);

        double underflowDouble = minDouble * 2; // Переполнение
        System.out.println("Результат переполнения double: " + underflowDouble); // Ожидаемое значение: -Infinity


    }
}
