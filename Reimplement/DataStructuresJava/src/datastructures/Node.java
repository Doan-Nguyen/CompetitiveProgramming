package datastructures;

public class Node {
    public int data;
    public Node next;

    public Node createNode(int val){
        Node new_node = new Node();
        new_node.data = val;
        new_node.next = null;
        return new_node;
    }

    public void displayNodeData(){
        System.out.println("Node data: " + data);
    }
}
