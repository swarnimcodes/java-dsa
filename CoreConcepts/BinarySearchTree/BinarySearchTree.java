package CoreConcepts.BinarySearchTree;

public class BinarySearchTree {
    private Node root;
    private int size;

    public class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(int val) {
        if (root == null) {
            Node newNode = new Node(val);
        } else {
            Node currentNode = root;

        }
        size++;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
    }
}
