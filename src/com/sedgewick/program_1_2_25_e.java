package com.sedgewick;

import static math_objects.custom_functions.wind_chill;

public class program_1_2_25_e {
    public static void main(String[] args) {
        for (double temperature = -50; temperature < 51; temperature = temperature + 2) {
            for (int velocity = 3; velocity < 121; velocity = velocity + 7) {
                System.out.println("Temperature::" + temperature + "||Velocity::" + velocity +
                        "||WindChill::" + wind_chill(temperature, velocity));
            }
            System.out.println();
        }
    }
}
