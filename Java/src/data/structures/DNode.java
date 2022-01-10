package data.structures;

public class DNode<T extends Comparable<T>> {
    private T data;
    private DNode<T> previousNode;
    private DNode<T> nextNode;

    public DNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public DNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
