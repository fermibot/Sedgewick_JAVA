package gus_sessions;

import static java.lang.Math.pow;

public class GeometricSequences {

    private double a;
    private double r;

    public GeometricSequences(double a1, double r1) {
        a = a1;
        r = r1;
    }

    public boolean GeometricDetect(double g1, double g2, double g3) {
        return g2 / g1 == g3 / g2;
    }

    public boolean GeometricDetect(float g1, float g2, float g3) {
        return g2 / g1 == g3 / g2;
    }

    public boolean GeometricDetect(int g1, int g2, int g3) {
        return g2 / g1 == g3 / g2;
    }

    public double GeometricSequence(int n) {
        return a * pow((float) r, n - 1);
    }

    public static void main(String[] args) {
        GeometricSequences g1 = new GeometricSequences(2, 1.1);
        System.out.println(g1.GeometricDetect(1.0, 2.0, 4.0));
        for (int i = 0; i < 7442; i++) {
            System.out.println("Sequence::" + i + "||Number::" + g1.GeometricSequence(i));
        }
    }
}
