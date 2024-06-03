
public class BinarySearchTree {

  // TreeNode Structure
  public class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  // Insertion
  public TreeNode insert(TreeNode root, int val) {
    if (root == null) {
      TreeNode newTreeNode = new TreeNode(val);
      root = newTreeNode;
    }
    if (val < root.val) {
      root.left = insert(root.left, val);
    } else if (val > root.val) {
      root.right = insert(root.right, val);
    }
    return root;
  }

  // Deletion 
  public TreeNode delete(TreeNode root, int val) {
    if (root ==  null) return root;
    if (val > root.val) {
      root.right = delete(root.right, val);
    } else if (val < root.val) {
      root.left = delete(root.left, val);
    } else {
      // found the elem to delete
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      } else {
        TreeNode minTreeNode = minimum(root.right);
        root.val = minTreeNode.val;
        root.right = delete(root.right, minTreeNode.val);
      }
    }
    return root;
  }

  // Searching
  public boolean isPresent(TreeNode root, int val) {
    TreeNode temp = search(root, val);
    return temp != null;
  }
  public TreeNode search(TreeNode root, int val) {
    if (root == null) return root;
    if (val > root.val) {
      return search(root.right, val);
    } else if (val < root.val) {
      return search(root.left, val);
    } else {
      return root;
    }
  }

  // Minimum Value
  public TreeNode minimum(TreeNode root) {
    if (root == null) throw new IllegalStateException("Tree is empty.");
    TreeNode curr = root;
    while (curr != null && curr.left != null) {
      curr = curr.left;
    }
    return curr;
  }

  // Inorder Traversal
  public void inorder(TreeNode root) {
    if (root != null) {
      inorder(root.left);
      System.out.println(root.val + " ");
      inorder(root.right);
    }
  } 

  // Pre-order Traversal
  public void preorder(TreeNode root) {
    if (root != null) {
      System.out.println(root.val + " ");
      preorder(root.left);
      preorder(root.right);
    }
  }

  // Post-order Traversal
  public void postorder(TreeNode root) {
    if (root != null) {
      preorder(root.left);
      preorder(root.right);
      System.out.println(root.val + " ");
    }
  }

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    TreeNode root = null;
    root = bst.insert(root, 50);
    root = bst.insert(root, 30);
    root = bst.insert(root, 20);
    root = bst.insert(root, 40);
    root = bst.insert(root, 70);
    root = bst.insert(root, 60);
    root = bst.insert(root, 80);

    bst.inorder(root);

    // Search for key 60
    System.out.println("\nIs key 60 present? " + bst.isPresent(root, 60));
    root = bst.delete(root, 60);
    System.out.println("\nIs key 60 present? " + bst.isPresent(root, 60));
    bst.inorder(root);
    TreeNode minimumNode = bst.minimum(root);
    System.out.println("Minimum Value: " + minimumNode.val);

    // Search for key 25
    System.out.println("Is key 25 present? " + bst.isPresent(root, 25));
  }
}
