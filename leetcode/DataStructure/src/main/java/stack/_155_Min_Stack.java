/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

package stack;

public class _155_Min_Stack {
    class Node{
        int val;
        int minVal;
        Node next;


        Node(int val, int minVal, Node next){
            this.val = val;
            this.minVal = minVal;
            this.next = next;
        }
    }

//    Node topNode = new Node();
    private Node topNode;

    public void push(int val) {
        if (topNode == null){
            topNode = new Node(val, val, null);
        } else {
            Node newNode = new Node(val, Math.min(topNode.minVal, val), topNode);
            topNode = newNode;
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
            System.out.println("Empty!");
        } else {
            while(topNode != null){
                System.out.print(topNode.val + " - ");
                topNode = topNode.next;
            }
        }
    }

    public static void main(String[] args){
        _155_Min_Stack test = new _155_Min_Stack();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        test.pop();
        System.out.println(test.top());
        System.out.println(test.getMin());
        test.show();
    }
}
