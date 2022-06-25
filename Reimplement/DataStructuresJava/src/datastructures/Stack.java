package datastructures;

public class Stack<T> {
    LinkedList<T> list_stack = new LinkedList<>();

    public Stack(){}

    public Stack(T first_element){
        list_stack.addFist(first_element);
    }

    public int size(){
        return list_stack.size();
    }

    public boolean isEmpty(){
        return list_stack.isEmpty();
    }

    public void push(T val){
        /*  push an element on the stack  (LIFO)  ~ them vao cuoi    */
        list_stack.addLast(val);
    }

    public T pop(){
        /*  LIFO -> xoa cuoi cung (out)    */
        if(isEmpty()){
            throw new RuntimeException("Empty list");
        }
        return list_stack.removeLast();
    }

    public T peek(){
        /*  peek the top of the stack (last element) without removing an element*/
        if(isEmpty()){
            throw new RuntimeException("Empty list");
        }
        return list_stack.peerLast();
    }

}
