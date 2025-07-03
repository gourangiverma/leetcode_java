package utils;

public class charStack {
    private static final int DEFAULT_SIZE = 5;
    protected char[] data;
    public int pointer = -1;

    // constructor
    public charStack() {
        data = new char[DEFAULT_SIZE];
    }

    // resize
    private void resize() {
        char[] newData = new char[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    // state check
    public boolean isFull() {
        return pointer == data.length - 1;
    }
    public boolean isEmpty() {
        return pointer == -1;
    }

    // push - adds item to stack
    public void push(char item) {
        if(isFull()) resize();
        data[++pointer] = item;
    }

    // pop - removes last item on stack, returns value of item
    public char pop() {
        return data[pointer--];
    }

    // peek - returns value of last element, does not remove it.
    public char peek() {
        return data[pointer];
    }
}
