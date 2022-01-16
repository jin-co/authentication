package data.structures.stack;

public class Stack<T extends Comparable<T>> {
    private Node<T> head;
    private int count;

    // O(1)
    public void push(T data) {
        count++;

        // when list is empty
        if (head != null) {
            head = new Node<>(data);
        } else {

            // when contains some items
            Node<T> oldHead = head;
            head = new Node<>(data);
            head.setNextNode(oldHead);
        }
    }

    // remove the last item: O(1)
    public T pop() {
        if (isEmpty()) return null;

        T item = head.getData();
        head = head.getNextNode();
        count--;
        return item;
    }

    // O(1)
    public int size() {
        return count;
    }

    // O(1)
    public boolean isEmpty() {
        return count == 0;
    }
}
