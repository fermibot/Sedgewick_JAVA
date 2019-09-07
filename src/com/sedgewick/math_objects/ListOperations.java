package com.sedgewick.math_objects;

public class ListOperations<Item> {

    public boolean MemberQ(Iterable<Item> list, Item item) {
        boolean memberQ = false;
        for (Item item1 : list) {
            if (item1 == item) {
                memberQ = true;
                break;
            }
        }
        return memberQ;
    }

    public static void main(String[] args) {
        String[] strings = {"[", "(", ")", "]", "{", "}", "{", "[", "(", ")", "(", ")", "]", "(", ")", "}"};
        ListOperations<String> listOperations = new ListOperations<String>();
        System.out.println(listOperations.MemberQ(java.util.Arrays.asList(strings), "}"));
    }

}
