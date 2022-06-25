/*
* Queue using Linked List
* */
package datastructures;

public class Queue<T> {
    LinkedList<T> list_queue = new LinkedList<T>();

    public Queue(){}

    public Queue(T last_val){
        list_queue.addLast(last_val);
    }

    public int size(){
        return list_queue.size();
    }

    public boolean isEmpty(){
        return list_queue.isEmpty();
    }

    public T peek(){
        /*      FIFO -> peek the element at the front => first element    */
        if(isEmpty()) throw new RuntimeException("Queue empty");
        return list_queue.peerFirst();
    }

    public T poll(){
        /*      FIFO -> poll the element at the front => first element    */
        if(isEmpty()) throw new RuntimeException("Queue empty");
        return list_queue.removeFirst();
    }

    public void offer(T val){
        /*      Add an element to the back of the queue             */
        list_queue.addLast(val);
    }

    public void enqueue(T val){

    }

    public void dequeue(T val){

    }

}
