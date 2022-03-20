package datastructures;

public class Stack {
    /*              update head node        */
    private Node head = null;

    public void push(int val){
        /*      adds key to collection      */
        Node new_node = new Node();
        new_node = new_node.createNode(val);
        if (head == null){
            head = new_node;
        }
        else {
            new_node.next = head;
            head = new_node;
        }
    }

    public int top(){
        /* return most recently-added key   */
        if (head==null){
            System.out.println("Linked list empty");
            return 0;
        }
        else {
            int head_val = head.data;
            return head_val;
        }
    }

    public int pop(){
        /*  removes & returns most recently-added key   */
        Node tmp_node = new Node();
        tmp_node = head;
        if (head==null){
            System.out.println("Linked list empty");
            return 0;
        }
        else {
            int head_val = head.data;
            head = head.next;
            return head_val;
        }
    }

    /*        show linked list     */
    public void dislayLinkedList(){
        Node current = head;
        //
        if (head == null){
            System.out.println("Linked list empty");
        }
        else{
            while(current != null){
                System.out.println("Current node data: " + current.data);
                current = current.next;
            }
        }
    }

    public static void main(String args[]){
        Stack my_stack = new Stack();
        my_stack.push(10);
        my_stack.push(20);
        my_stack.push(30);
        my_stack.dislayLinkedList();
        System.out.println("Number node: " + my_stack.head);
    }
}
