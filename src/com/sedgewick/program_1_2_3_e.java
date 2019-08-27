package com.sedgewick;

public class program_1_2_3_e {
    private static boolean expression(boolean a, boolean b) {
        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    public static void main(String[] args) {
        boolean[] truths = {true, false};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("A = " + i + ", B = " + j + " Result = " + expression(truths[i], truths[j]));
            }
        }
    }
}
