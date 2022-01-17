package data.structures.stack;

public class StackWithArray<T> {
    private T[] stack;
    private int count;

    public StackWithArray() {
        stack = (T[]) new Object[1];
    }

    // add the new item to the end: O(1)
    public void push(T newData) {

        // resizing
        if (count == stack.length) {
            resize(2 * count);
        }

        // inserting
        stack[count++] = newData;
    }

    // O(1)
    public T pop() {
        if(isEmpty()) return null;

        T item = stack[--count];

        // to avoid memory leaks
        stack[count] = null;

        // resize
        if (count > 0 && count == stack.length / 4) {
            resize(count / 2);
        }

        return item;
    }

    // O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    // O(1)
    public int size() {
        return count;
    }

    // O(N)
    private void resize(int capacity) {
        T[] stackCopy = (T[]) new object[capacity];

        // copy the items one by one
        for (int j = 0; j < count; j++) {
            stackCopy[j] = stack[j];
            stack = stackCopy;
        }
    }
}
