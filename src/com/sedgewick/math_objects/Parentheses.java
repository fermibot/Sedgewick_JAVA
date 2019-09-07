package com.sedgewick.math_objects;

public class Parentheses<Item> {
    private static ResizingArrayStack<String> allChars = new ResizingArrayStack<>();
    private static ResizingArrayStack<String> uniqueChars = new ResizingArrayStack<>();
    private static ResizingArrayStack<String> parentheses = new ResizingArrayStack<>();

    private static String[] strings = {"[", "(", ")", "]", "{", "}", "{", "[", "(", ")", "(", ")", "]", "(", ")", "}"};
    private static String[] leftStrings = {"{", "[", "("};
    private static String[] rightStrings = {"}", "]", ")"};


    public static void main(String[] args) {
        ListOperations listOperations = new ListOperations<>();
        uniqueChars.push(strings[0]);
        for (String string :
                strings) {
            allChars.push(string);

            if (listOperations.MemberQ(uniqueChars, string)) {
                continue;
            }
            uniqueChars.push(string);
        }
        for (String string1:
             strings) {
            if ()
        }
    }
}
