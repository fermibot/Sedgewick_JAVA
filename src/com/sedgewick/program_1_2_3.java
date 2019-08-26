package com.sedgewick;

public class program_1_2_3 {
    public static void main(String[] args) {
        double b, c, discriminant, d;
        b = Double.parseDouble(args[0]);
        c = Double.parseDouble(args[1]);
        discriminant = b * b - 4.0 * c;
        d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);
    }
}
