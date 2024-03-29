package com.sedgewick.math_objects;

import java.util.Iterator;


public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1]; // stack items
    private int N = 0; // number of items

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) { // Move stack to a new array of size max.
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    public void push(Item item) { // Add item to top of stack.
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() { // Remove item from top of stack.
        Item item = a[--N];
        a[N] = null; // Avoid loitering (see text).
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    public void setValue(Item value, int n) {
        if (n <= N) {
            a[n] = value;
        }
    }

    public Item getValue(int n) {
        Item getValue1 = a[N];
        if (n <= N) {
            getValue1 = a[n];
        }
        return getValue1;
    }

    public Item getLast() {
        if (N != 0) {
            return a[N - 1];
        } else return null;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> { // Support LIFO iteration.
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {
        }
    }
}
