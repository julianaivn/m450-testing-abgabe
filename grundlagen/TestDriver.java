public class TestDriver {

    static boolean approxEquals(double a, double b) {
        return Math.abs(a - b) < 0.001;
    }

    public static void main(String[] args) {

        boolean test_ok = true;

        // 3 Extras → 10% Zubehör-Rabatt
        test_ok &= approxEquals(
            PriceCalculator.calculatePrice(20000, 500, 4000, 3, 8),
            22500
        );

        // 5 Extras → 15% Zubehör-Rabatt
        test_ok &= approxEquals(
            PriceCalculator.calculatePrice(20000, 500, 4000, 5, 8),
            22300
        );

        System.out.println(test_ok ? "✅ Tests OK" : "❌ Test fehlgeschlagen");
    }
}
