package datastructures;


public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public boolean isEmpty(){
        return head==null;
    }

    public int length(){
        Node tmp_node = new Node();
        tmp_node = head;
        int count = 0;
        if(tmp_node == null){
            return 0;
        }
        else{
            while (tmp_node != null){
                count ++;
                tmp_node = tmp_node.next;
            }
            return count;
        }
    }

    /*          Insertion           */
    public void pushFront(int val){
        Node new_node = new Node();
        new_node.data = val;
        new_node.next = null;
        //
        if (head == null){
            head = new_node;
            tail = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
    }

    public void pushBack(int val){
        Node new_node = new Node();
        new_node.data = val;
        new_node.next = null;
        //
        if (tail == null){
            head = new_node;
            tail = new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void pushIndex(int index_pos, int val){
        Node new_node = new Node();
        new_node.data = val;
        new_node.next = null;
        //
        if (index_pos==1){
            new_node.next = head;
            head = new_node;
        }
        else {
            Node tmp_node = new Node();
            tmp_node = head;
            for (int i=1; tmp_node != null & i < index_pos; i++){
                tmp_node = tmp_node.next;
            }
            new_node.next = tmp_node.next;
            tmp_node.next = new_node;
        }
    }

    /*          Deletion           */
    public void popFirst(){
        if (head == null){
            System.out.println("Linked list empty");
        }
        else{
            head = head.next;
        }
    }

    public void popBack(){
        if (head == tail) System.out.println("Linked list empty");
        else{
            Node tmp = new Node();
            tmp = head;
            while (tmp.next.next != null){
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
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
        LinkedList my_linked_list = new LinkedList();
        my_linked_list.pushFront(5);
        my_linked_list.pushFront(10);
        my_linked_list.pushBack(20);
        my_linked_list.pushBack(30);
        my_linked_list.dislayLinkedList();
        System.out.println("Linked list org");
        my_linked_list.pushIndex(2, 100);
//        my_linked_list.popFirst();
        my_linked_list.dislayLinkedList();
//        System.out.println("Linked list pop back");
//        my_linked_list.popBack();
//        my_linked_list.dislayLinkedList();
        int count = my_linked_list.length();
        System.out.println("Number node: " + count);
    }
}


