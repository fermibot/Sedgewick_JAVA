package com.sedgewick.math_objects;

import static java.util.Arrays.asList;


public class Parentheses<Item> {
    private static ResizingArrayStack<String> allChars = new ResizingArrayStack<>();
    private static ResizingArrayStack<String> parentheses = new ResizingArrayStack<>();

    private static String[] strings = {"{", "[", "(", ")", "]", "{", "}", "{", "[", "(", ")", "(", ")", "]", "(", ")", "}"};
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
        for (String string :
                strings) {
            allChars.push(string);
        }

        int tracker = allChars.size();
        for (String string :
                allChars) {
            boolean allNull = true;

            for (String allChar :
                    allChars) {
                allNull = allNull & (allChar == null);
            }

            if (!allNull) {
                if (string == null) {
                    continue;
                } else if (listOperations.MemberQ(asList(rightStrings), string)) {
                    System.out.println("Pushed::" + string);
                    parentheses.push(string);
                } else if (listOperations.MemberQ(asList(leftStrings), string)) {
                    String converse1 = converse(parentheses.getLast());
                    if (string.equals(converse1)) {
                        System.out.println("Removed::" + parentheses.pop());
                        allChars.setValue(null, tracker);
                        if (tracker != 0) {
                            allChars.setValue(null, tracker - 1);
                        }
                    }
                }
                if (tracker > 0) {
                    tracker--;
                }

                System.out.print("CurrentList::");
                for (String allChar :
                        allChars) {
                    System.out.print(allChar + "");
                }
                System.out.println("\n");
            } else {
                System.out.println("The list is balanced");
                break;
            }
        }
    }
}
