package com.sedgewick.math_objects;


import static java.util.Arrays.asList;


public class Parentheses<Item> {
    private static ResizingArrayStack<String> allChars = new ResizingArrayStack<>();
    private static ResizingArrayStack<String> uniqueChars = new ResizingArrayStack<>();
    private static ResizingArrayStack<String> parentheses = new ResizingArrayStack<>();

    private static String[] strings = {"[", "(", ")", "]", "{", "}", "{", "[", "(", ")", "(", ")", "]", "(", ")", "}"};
    private static String[] leftStrings = {"{", "[", "("};
    private static String[] rightStrings = {"}", "]", ")"};

    private static String converse(String string) {
        String converse1 = "";
        if (string.equals("}")) converse1 = "{";
        else if (string.equals("{")) converse1 = "}";
        else if (string.equals("(")) converse1 = ")";
        else if (string.equals(")")) converse1 = "(";
        else if (string.equals("[")) converse1 = "]";
        else if (string.equals("]")) converse1 = "[";
        return converse1;
    }


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

        System.out.println(converse("{"));

        String previous = strings[0];
        parentheses.push(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            String current = strings[i];
            if (listOperations.MemberQ(asList(leftStrings), current)) {
                parentheses.push(current);
                previous = current;
            } else if (listOperations.MemberQ(asList(rightStrings), current)) {
                String converse1 = converse(current);
                if (previous.equals(converse1)) {
                    parentheses.pop();
                    i++;
                    previous = strings[i + 2];
                } else if (!current.equals(converse1)) {
                    System.out.println("List is unbalanced");
                }
            }
        }
    }
}
