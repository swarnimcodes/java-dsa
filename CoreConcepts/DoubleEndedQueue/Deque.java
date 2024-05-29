package CoreConcepts.DoubleEndedQueue;

public class Deque {
    private Node head;
    private Node tail;
    private int size;

    public static class Node {
        int val;
        Node next; // stores the memory address of the next object
        Node prev;

        // constructor: initialises the object whenever
        // a new instance of this class is created
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public void printDeque() {
        if (size == 0) {
            return;
        } else {
            Node currentNode = head;
            for (int i = 0; i < size; ++i) {
                System.out.println(currentNode.val + ", ");
                currentNode = currentNode.next;
            }
        }
        return;
    }

    // add elem at the end
    public void offerLast(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // add elem at the start
    public void offerFirst(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }
        size++;
    }

    public int pollLast() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        int val = tail.val;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return val;
    }

    public int pollFirst() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        int val = head.val;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    public int peekLast() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        return tail.val;
    }

    public int peekFirst() {
        if (size == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        return head.val;
    }

    // Clear the deque
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public Deque() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Deque dq = new Deque();
        dq.offerLast(0);
        dq.offerLast(1);
        dq.offerLast(2);
        dq.offerLast(3);
        dq.offerLast(4);
        dq.offerLast(5);
        dq.offerLast(6);
        dq.offerLast(7);
        dq.printDeque();
        dq.pollLast();
        dq.printDeque();
        dq.offerLast(9);
        dq.printDeque();
    }
}
