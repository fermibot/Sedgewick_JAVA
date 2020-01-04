
import static java.lang.Math.pow;

public class Trigonometric {

    int precision;

    public Trigonometric(int precisionIn) {
        precision = precisionIn;
    }

    private double Factorial(double x) {
        double factorial = 0;
        if (x == 0) return 1;
        if (x == 1) return 1;
        if (x > 1) factorial = x * Factorial(x - 1);
        return factorial;
    }

    private double sine_cos(double x, int one_or_zero) {
        double _sine_cos = 0;

        for (int i = 0; i < precision; i++) {
            int expFact = 2 * i + one_or_zero;
            _sine_cos += pow(-1, i) * pow(x, expFact) / Factorial(expFact);
        }
        return _sine_cos;
    }


    public double Sin(double x) {
        return sine_cos(x, 1);
    }

    public double Cos(double x) {
        return sine_cos(x, 0);
    }

    public static void main(String[] args) {
        Trigonometric trigonometric = new Trigonometric(120);
        System.out.println(trigonometric.Factorial(5));
        System.out.println(trigonometric.Sin(10));
        System.out.println(trigonometric.Cos(10));
    }
}
