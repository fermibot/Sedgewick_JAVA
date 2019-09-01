package com.sedgewick.math_objects;

public class Queue<Item> {
    private Node first;
    private Node last;
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

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        String[] strings = {"to", "be", "or", "not", "to", "-", "be", "-", "-", "that", "-", "-", "-", "is"};
        for (String string :
                strings) {
            if (string != "-") queue.enqueue(string);
            else if (!queue.isEmpty()) System.out.print(queue.dequeue() + " ");
        }
        System.out.print("(" + queue.size() + " left on queue)");
    }
}
