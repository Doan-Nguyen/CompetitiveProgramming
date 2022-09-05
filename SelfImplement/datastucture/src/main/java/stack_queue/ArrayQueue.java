package stack_queue;

public class ArrayQueue implements InterfaceStackQueue {
    private int[] array;
    private int arraySize;
    private int headIndex;
    private int tailIndex;

    public ArrayQueue(int size){
        arraySize = size;
        array = new int[arraySize];
        headIndex = tailIndex = -1;
    }

    /*      push into tail          */
    @Override
    public boolean push(int value) {
        if (!isFull()){
            if (isEmpty()){
                headIndex++;
            }
            array[tailIndex] = value;
            tailIndex++;
            return true;
        }
        return false;
    }

    /*      pop into head           */
    @Override
    public int pop() {
        int value = -1;
        if(!isEmpty()){
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex){
                headIndex = tailIndex = -1;
            }
        }
        return 0;
    }



    @Override
    public boolean isFull() {
        return tailIndex == arraySize - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1 && tailIndex == -1);
    }

    @Override
    public int count() {
        if (isEmpty()){
            return 0;
        }
        return array.length;
    }

    @Override
    public void show() {
        if(isEmpty()){
            System.out.println("Queue is empty!");
        } else {
            for (int i = headIndex; i <= tailIndex; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
