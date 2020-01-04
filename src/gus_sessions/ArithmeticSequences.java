package gus_sessions;

public class ArithmeticSequences {
    private double a;
    private double d;

    public ArithmeticSequences(double first1, double t1) {
        a = first1;
        d = t1;
    }

    public double arithmetic_number(int n) {
        return a + (n - 1) * d;
    }

    public double[] arithmetic_sequence(int n) {
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            result[i] = arithmetic_number(i);
        }
        return result;
    }

    public double[] arithmetic_detect(double a1, double a2, double a3) {
        double[] result = new double[2];
        if (a2 - a1 == a3 - a2) {
            result[0] = a1;
            result[1] = a2 - a1;
        }
        return result;
    }

    public static void main(String[] args) {
        ArithmeticSequences arithmeticSequences = new ArithmeticSequences(1, 1);
        System.out.println(arithmeticSequences.arithmetic_number(10));
        System.out.println();
        for (double number :
                arithmeticSequences.arithmetic_sequence(10)) {
            System.out.println(number);
        }
    }
}
