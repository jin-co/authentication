package data.structures;

public class LinkedList<T extends Comparable<T>> implements List<T> {
    // first node(head node)
    private Node<T> root;
    private int numOfItems;

    // finding an item in the middle
    public Node<T> getMiddleNode() {
        Node<T> slow = this.root;
        Node<T> fast = this.root;

        // O(N/2) running time
        while(fast.getNextNode() != null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();
        }
        return slow;
    }

    // reverse
    public void reverse() {
        Node<T> currentNode = this.root;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        this.root = previousNode;
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            // this is the first data in the linked list
            root = new Node<>(data);
        } else {
            // this is not the first data in the linked list
            insertBeginning(data);
        }
    }

    // O(1)
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    // O(N)
    private void insertEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (root == null) return;

        if (root.getData().compareTo(data) == 0) {
            root = root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T data, Node<T> root, Node<T> actualNode) {
        // to find the node to remove
        while(actualNode != null) {
            // this is the node to remove
            if (actualNode.getData().compareTo(data) == 0) {
                numOfItems--;
                root.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            root = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public void traverse() {
        if (root == null) return;
        Node<T> actualNode = root;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return numOfItems;
    }
}
