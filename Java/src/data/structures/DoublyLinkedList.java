package data.structures;

public class DoublyLinkedList<T extends Comparable<T>> {
    private DNode<T> head;
    private DNode<T> tail;

    public void insert(T data) {
        DNode<T> newNode = new DNode<>(data);

        // first item in the list
        if (tail == null) {
            // both of the pointers are pointing to the new node
            tail = newNode;
            head = newNode;
        } else {
            // insert the new item to the end O(1)
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public void traverseForward() {
        DNode<T> actualNode = head;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    public void traverseBackward() {
        DNode<T> actualNode = tail;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getPreviousNode();
        }
    }
}
