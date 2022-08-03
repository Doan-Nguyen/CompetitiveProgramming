package stack_queue;

public class LinkedListStack implements InterfaceStackQueue{
    private class Node{
        int value;
        Node nextNode;

        Node(int value){
            this.value = value;
        }
    }

    Node topNode;

    //      mac dinh khi khoi tao top node bang null
    LinkedListStack(){
        topNode = null;
    }

    /*      push ~ viec chen them phan tu vao head
        Step 1: tro new node vao (head) node cu
        Step 2: gan  head = new node
    * */
    @Override
    public boolean push(int value) {
        if (!isFull()){
            Node newNode = new Node(value);
            newNode.nextNode = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }



    @Override
    public int pop() {
        if (isEmpty()){
            return  -1;
        }
        int topValue = topNode.value;
        topNode = topNode.next;
        return topValue;
    }

    //      khi su dung stack k biet khi nao full bo nho
    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void show() {

    }
}
