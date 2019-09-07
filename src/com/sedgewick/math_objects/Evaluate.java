package com.sedgewick.math_objects;

public class Evaluate {
    private static String[] strings;
    private static String dummy;
    private Stack<String> operators = new Stack<>();
    private Stack<Double> values = new Stack<>();

    public Evaluate(String[] strings1) {
        strings = strings1;
    }

    public Evaluate(String string) {
        strings = string.split("");
    }

    public double process(String[] strings) {
        for (String string :
                strings) {
            if (string.equals("(")) dummy = string;
            else if (string.equals("+")) {
            }
        }
        return 1.0;
    }

    public static void main(String[] args) {

    }

}
