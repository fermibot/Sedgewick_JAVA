package com.sedgewick;

public class program_1_2_2_e {
    private static double sine_cosine_square(double theta) {
        return Math.pow(Math.sin(theta), 2) + Math.pow(Math.cos(theta), 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            double random_number = -1 + 2 * Math.random();
            System.out.println("Theta::" + random_number + "||Sum of squares::" + sine_cosine_square(random_number));
        }
    }
}
