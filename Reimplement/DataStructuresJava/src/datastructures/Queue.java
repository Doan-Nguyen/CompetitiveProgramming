/*
* Queue using Linked List
* */
package datastructures;

public class Queue {
    private Node head, tail;
    private int current_size;

    //
    public Queue(){
        head = null;
        tail = null;
        current_size = 0;
    }

    public boolean isEmpty(){
        return (current_size==0);
    }

    public int dequeue(){
        /*  This function removes and returns least recently-added (head) key
        *   ~ popFront() in linked list
        */
        int front_val = head.data;
        head = head.next;
        current_size--;
        return front_val;
//        }
    }

    public void enqueue(int val){
        /*
        *       Add data to the end of the list
        */
        Node node = new Node();
        Node new_node = node.createNode(val);
        //
        if (head == null){
            head = new_node;
        }
        else{
            new_node.next = tail;
            tail = new_node;
        }
        current_size++;
    }


    public int peekLast(){
        Node tmp_node = new Node();
        tmp_node = head;
        int last_val = 0;
        while (tmp_node != null){
            last_val = tmp_node.data;
            tmp_node = tmp_node.next;
        }
        return last_val;
    }

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
        Queue new_queue = new Queue();
        new_queue.enqueue(5);
        new_queue.enqueue(1);
        new_queue.enqueue(6);
        //
        new_queue.dislayLinkedList();
    }
}
