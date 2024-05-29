package CoreConcepts.LinkedList.SinglyLinked;

public class SinglyLinked {
    private Node head;
    private int size;

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // constructor
    public SinglyLinked() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, int val) {
        if (index > size || index < size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        if (index == 0) {
            addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;
        int currentIndex = 0;

        while (currentIndex <= index) {
            current = current.next;
            currentIndex++;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;

            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = null;
        }

        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1; ++i) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        size--;
    }

    public int getFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        return head.val;
    }

    public int getLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.val;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        Node current = head;
        int i = 0;

        while (i < index) {
            current = current.next;
        }
        return current.next.val;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int requiredVal) {
        if (size < 1) {
            return false;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.val == requiredVal) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public void printLL() {
        if (size == 0) {
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                System.out.println(current.val);
                current = current.next;
            }
        }
        return;
    }

    public void reverse() {
        if (size == 0) {
            return;
        }
        Node tempNode = head;
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            currentNode.next = tempNode;
            tempNode = currentNode;
        }
    }

    public static void main(String[] args) {
        SinglyLinked ll = new SinglyLinked();
    }
}
