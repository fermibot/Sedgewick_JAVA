package com.sedgewick.math_objects;

public class Flow {

    private Node startNode;
    private Node endNode;
    private float flow;

    Flow(Node start_node, Node end_node) {
        startNode = start_node;
        endNode = end_node;
        start_node.addNext(end_node);
    }

    public void setFlow(float _flow) {
        flow = _flow;
    }

    public float getFlow() {
        return flow;
    }

    public static void main(String[] args) {
        Flow flow = new Flow(new Node("Node_A"), new Node("Node_B"));
        flow.setFlow(100);
        System.out.println(flow.startNode.getId());
        System.out.println(flow.startNode.getNext().getId());
        System.out.println(flow.endNode.getNext());
        System.out.println(flow.getFlow());
    }
}
