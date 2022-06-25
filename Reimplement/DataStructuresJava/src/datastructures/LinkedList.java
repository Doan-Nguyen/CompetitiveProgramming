package datastructures;


public class LinkedList<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    private static class Node<T>{
        private T data;
        private Node<T> prev, next;

        public Node(T initial_data, Node<T> initial_prev, Node<T> initial_next){
            this.data = initial_data;
            this.prev = initial_prev;
            this.next = initial_next;
        }
    };

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size() == 0);
    }

    public void clear(){
        /*          Empty this linked list - O(n)     */
        Node<T> tmp_node = head;
        while(tmp_node != null){
            Node<T> next_node = tmp_node.next;
            //      remove prev, next node & current node's data
            tmp_node.prev = null;
            tmp_node.next = null;
            tmp_node.data = null;
            tmp_node = next_node;
        }
        //      remove head, tail & temporary node
        head = null;
        tail = null;
        tmp_node = null;
        size = 0;
    }

    /*          Intersection                */
    public void addLast(T val){
        Node<T> new_node = new Node<T>(val, null, null);
        if(isEmpty()){
            head = new_node;
            tail = new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node;
        }
        size ++;
    }

    public void addFist(T val){
        Node<T> new_node = new Node<T>(val, null, null);
        if(isEmpty()){
            head = new_node;
            tail = new_node;
        }
        else{
            head.prev = new_node;
            head = head.prev;
        }
        size ++;
    }

    public void addAtPosition(int idx, T data)throws Exception{
        if(idx > size() || idx < 0){
            throw new Exception("Index incorrect");
        } else if(idx == 0){
            addFist(data);
        } else if(idx == size()){
            addLast(data);
        }
        //      get exactly node in idx-position
        Node<T> tmp_node = head;
        for(int i=0; i < idx - 1; i++){
            tmp_node = tmp_node.next;
        }
        //      lắp vào (new node) & gắn lại (2 nodes cũ)
        Node<T> new_node = new Node<>(data, tmp_node, tmp_node.next);
        tmp_node.next.prev = new_node;
        tmp_node.next = new_node;
        //
        size++;
    }

    public T peerFirst(){
        /*          return: head.data           */
        if(isEmpty()){
            throw new RuntimeException("Empty list");
        }
        return head.data;
    }

    public T peerLast(){
        /*          return: tail.data           */
        if(isEmpty()){
            throw new RuntimeException("Empty list");
        }
        return tail.data;
    }

    /*              Deletion                    */
    public T removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("Empty list");
        }
        T data = head.data;
        head = head.next;
        //          Memory cleanup
        if(isEmpty()) tail = null;
        else head.prev = null;
        //
        size --;
        return data;
    }

    public T removeLast(){
        /*  Return data & remove last node*/
        if(isEmpty()){
            throw new RuntimeException("Empty list");
        }
        T last_data = tail.data;
        tail = tail.prev;
        //          Memory cleanup
        if(isEmpty()) head=null;
        else tail.next = null;
        //
        return last_data;
    }

    private T remove(Node<T> node){
        if(node.prev == null) removeFirst();
        if(node.next == null) removeLast();
        //
        T data = node.data;
        //      make the pointers of adjacent nodes skip over 'node'
        node.prev.next = node.next;
        node.next.prev = node.prev;
        //          memory cleanup
        node.data = null;
        node = null;
        node.next = null;
        node.prev = null;
        //          update size
        size--;
        return data;
    }

    public void removeAt(int index){
        if(index < 0 || index > size()){
            throw new IllegalArgumentException();
        }
        int i;
        Node<T> trav;
        //              get exactly node with index
        for(i = 0 , trav=head; i != index; i++){
            trav = trav.next;
        }
        for (i = size() - 1, trav=tail; i != index; i--){
            trav = trav.prev;
        }
        //          remove node
        remove(trav);
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
}


