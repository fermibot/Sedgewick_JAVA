package com.sedgewick;

import static com.sedgewick.custom_functions.compound_interest;

public class program_1_2_24_e {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(compound_interest(1520.0, 1.12, i));
        }
    }
}
