public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    // Inner Node class
    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= size) {
            return -1; // Return -1 if index is out of bounds
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = next(current); // Correctly traverse using next method
        }
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            // List is empty
            head = newNode;
            tail = newNode;
        } else {
            // Add at the end of the list
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            // Do nothing if index is out of bounds
            return;
        }

        Node current = head;

        if (index == 0) {
            // Removing the head node
            head = next(head); // Correctly move to the next node using next method
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // List is now empty
            }
        } else if (index == size - 1) {
            // Removing the tail node
            tail = prev(tail); // Correctly move to the previous node using prev method
            if (tail != null) {
                tail.next = null;
            }
        } else {
            // Removing a node in the middle
            for (int i = 0; i < index; i++) {
                current = next(current); // Traverse to the node using next method
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    // Private method to move to the next node and print the message
    private Node next(Node node) {
        System.out.print("Go to next node\n");
        return node.next;
    }

    // Private method to move to the previous node and print the message
    private Node prev(Node node) {
        System.out.print("Go to previous node\n");
        return node.prev;
    }
}