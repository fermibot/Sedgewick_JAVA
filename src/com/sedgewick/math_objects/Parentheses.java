package com.sedgewick.math_objects;

public class Parentheses<Item> {
    private static ResizingArrayStack<String> allChars = new ResizingArrayStack<>();
    private static ResizingArrayStack<String> uniqueChars = new ResizingArrayStack<>();

    private static String[] strings = {"[", "(", ")", "]", "{", "}", "{", "[", "(", ")", "(", ")", "]", "(", ")", "}"};

    public static void main(String[] args) {
        for (String string :
                strings) {
            allChars.push(string);
        }
    }
}
