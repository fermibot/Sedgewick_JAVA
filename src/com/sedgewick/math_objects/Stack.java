package com.sedgewick.math_objects;

public class Stack<Item> {
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] strings = {"to", "be", "or", "not", "to", "-", "be", "-", "-", "that", "-", "-", "-", "is"};
        for (String string :
                strings) {
            if (!string.equals("-")) {
                stack.push(string);
            } else if (!string.isEmpty()) {
                stack.pop();
            }
        }
        System.out.println("(" + stack.size() + " left on stack)");
    }
}