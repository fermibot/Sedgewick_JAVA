package com.sedgewick.math_objects;

public class Complex {
    private double real;
    private double complex;

    public Complex(double a, double b) {
        real = a;
        complex = b;
    }

    public double Re(Complex a) {
        return a.real;
    }

    public double Im(Complex a) {
        return a.complex;
    }

    public Complex Plus(Complex b) {
        return new Complex(real + b.real, complex + b.complex);
    }

    public Complex Plus(double b) {
        return new Complex(real + b, complex);
    }

    public Complex Minus(Complex b) {
        return new Complex(real - b.real, complex - b.complex);
    }

    public double Arg(Complex a) {
        return Math.atan2(a.complex, a.real);
    }


    public double Abs(Complex a) {
        return Math.sqrt(Math.pow(a.real, 2 + Math.pow(a.complex, 2)));
    }

    public double Abs() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(complex, 2));
    }


    private Complex Times(double a) {
        return new Complex(a * real, a * complex);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Complex a = new Complex(Math.random(), Math.random());
            Complex b = new Complex(Math.random(), Math.random());
            System.out.print("Real: " + a.Plus(b).real);
            System.out.print(" Complex: ");
            System.out.println(a.Plus(b).complex);
            System.out.println(a.Abs());
            System.out.println();
        }
    }
}
