package stack;


public class _155_Min_Stack {
    /*      Linked list
    * */
    public _155_Min_Stack() {
    }

    class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    // initialize a top node
    Node topNode;

    public void push(int val) {
        Node newNode = new Node(val);
        if (topNode == null){
            topNode = newNode;
        } else {
            newNode = topNode.next;
            topNode = newNode;
        }
    }

    public void pop() {

    }

    public int top() {

        return -1000;
    }

    public int getMin() {
        return -1000;
    }

    public void show(){
        if (topNode == null){
            System.out.println("Emtpy");
        } else {
            while (topNode != null){
                System.out.println(topNode.val + " -> ");
                topNode = topNode.next;
            }
        }
    }

    public static void main(String args[]){
        _155_Min_Stack minStack = new _155_Min_Stack();
        minStack.push(10);
        minStack.push(20);
        minStack.show();
    }
}
