package stack;


import javax.swing.plaf.synth.SynthUI;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class _155_Min_Stack {
    /*      Linked list
    * */
    public _155_Min_Stack() {
    }

    class Node {
        int val;
        int minVal;
        Node next;
        Node(int val, int minVal, Node next){
            this.val = val;
            this.minVal = minVal;
            this.next = null;
        }
    }

    // initialize a top node
    Node topNode;


    /*  this function determines the min value.
    * */
    public void push(int val) {
        if (topNode == null){
            topNode = new Node(val, val, null);
        } else {
            topNode = new Node(val, Math.min(val, topNode.minVal), topNode);
        }
    }

    public void pop() {
        if (topNode == null){
            System.out.println("Empty");
        } else {
            Node nextNode = topNode.next;
            topNode = nextNode;
        }
    }

    public int top() {
        return topNode.val;
    }

    public int getMin() {
        return topNode.minVal;
    }

    public void show(){
        if (topNode == null){
            System.out.println("Emtpy");
        } else {
            while (topNode != null){
                System.out.print(topNode.val + " - ");
                topNode = topNode.next;
            }
        }
    }

    public static void main(String args[]){
        _155_Min_Stack minStack = new _155_Min_Stack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(30);
        minStack.pop();
        minStack.show();
    }
}
