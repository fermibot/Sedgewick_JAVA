package com.sedgewick;

import static math_objects.custom_functions.xor;

public class program_1_2_5_e {
    public static void main(String[] args) {
        boolean[] truth = {true, false};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("A = " + truth[i] + ", B = " + truth[j] + ", Result = " + xor(truth[i], truth[j]));
            }
        }
    }
}
