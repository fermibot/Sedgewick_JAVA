package com.sedgewick.math_objects;

public class Node {
    private String id;
    private Node next;

    public Node(String id_in) {
        id = id_in;
    }

    public void addNext(Node next_in) {
        next = next_in;
    }

    public String getId() {
        return id;
    }

    public Node getNext() {
        return next;
    }

    public static void main(String[] args) {
        String[] pre_nodes = {"to", "be", "or", "not"};
        Node[] nodes = new Node[pre_nodes.length];
        for (int i = 0; i < pre_nodes.length; i++) {
            nodes[i] = new Node(pre_nodes[i]);
        }

        for (int i = 0; i < nodes.length; i++) {
            nodes[i].next = nodes[(i + 1) % 4];
        }

        for (int i = 0; i < 20; i++) {
            int array_len = nodes.length;
            System.out.println(nodes[i % array_len].id);
        }

    }

}
