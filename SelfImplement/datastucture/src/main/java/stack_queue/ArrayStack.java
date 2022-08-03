package stack_queue;

public class ArrayStack implements InterfaceStackQueue {

    private int[] array;
    private int arraySize;
    private int topIndex;

    ArrayStack(int size){
        arraySize = size;
        array = new int[size];
        topIndex = -1;
    }


    @Override
    public boolean push(int value) {
        if (!isFull()){
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()){
            int lastValue = array[topIndex];
            topIndex--;
            return lastValue;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == arraySize - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public int count() {
        if(isEmpty()){
            return 0;
        }
        return array.length;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else{
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]);
                System.out.print(" -> ");
            }
            System.out.println();
        }
    }
}
