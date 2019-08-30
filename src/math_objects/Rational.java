package math_objects;

public class Rational {
    private float n;

    private Rational(float rational_in) {
        n = rational_in;
    }

    private float Plus(Rational a) {
        return n + a.n;
    }

    private float Minus(Rational a) {
        return n - a.n;
    }

    private float Times(Rational a) {
        return n * a.n;
    }

    private float Divide(Rational a) {
        return n / a.n;
    }

    private boolean Equals(Rational a) {
        return n == a.n;
    }

    public static void main(String[] args) {
        Rational a = new Rational(10);
        Rational b = new Rational(11);
        System.out.println(a.Plus(a));
        System.out.println(a.Plus(b));
    }
}
