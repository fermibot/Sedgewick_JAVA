package com.sedgewick.math_objects.exercises;

import com.sedgewick.math_objects.Stack;

public class exercise_1_3_5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        int N = 50;
        while (N > 0) {
            stack.push("N % 2");
            N = N / 2;
        }
    }
}
