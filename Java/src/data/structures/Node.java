package data.structures;

public class Node<T extends Comparable<T>> {
    // data stored in the data structure
    private T data;

    // reference to the next node
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
}
