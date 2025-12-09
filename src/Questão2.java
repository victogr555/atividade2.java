public class Questão2 {
    public class MathUtils {
    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static boolean ePrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double celsiusParaFahrenheit(double c) {
        return (c * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5/9;
    }
}

}
