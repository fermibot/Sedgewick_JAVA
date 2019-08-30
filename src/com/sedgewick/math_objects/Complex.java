package com.sedgewick.math_objects;

import static com.sedgewick.math_objects.custom_functions.Norm;
import static java.lang.Math.*;

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

    public double Arg() {
        return atan2(complex, real);
    }


    public double Abs() {
        return Norm(real, complex);
    }

    public Complex Times(Complex a) {
        double abs_product = Abs() * a.Abs();
        double arg_sum = Arg() + a.Arg();
        return new Complex(abs_product * cos(arg_sum), abs_product * sin(arg_sum));
    }

    public Complex Divide(Complex a) {
        double abs_divide = Abs() / a.Abs();
        double arg_diff = Arg() - a.Arg();
        return new Complex(abs_divide * cos(arg_diff), abs_divide * sin(arg_diff));
    }

    public void printReal() {
        System.out.println("Real: " + real);
    }

    public void printComplex() {
        System.out.println("Complex: " + complex);
    }

    private Complex Times(double a) {
        return new Complex(a * real, a * complex);
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(1, 1);
        Complex plus = a.Plus(b);
        plus.printReal();
        plus.printComplex();

        System.out.println(a.Abs());
        System.out.println(a.Arg());
        System.out.println(a.Times(b).real);
        System.out.println(a.Times(b).complex);
        System.out.println(a.Divide(b).real);
        System.out.println(a.Divide(b).complex);
    }
}
