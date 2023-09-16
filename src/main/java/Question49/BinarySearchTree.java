package Question49;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int val) {
        root = insertRec(root, val);
    }

    TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    boolean search(int val) {
        return searchRec(root, val);
    }

    boolean searchRec(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }

        if (val < root.val) {
            return searchRec(root.left, val);
        } else {
            return searchRec(root.right, val);
        }
    }

    void delete(int val) {
        root = deleteRec(root, val);
    }

    TreeNode deleteRec(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (val < root.val) {
            root.left = deleteRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRec(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.val = minValue(root.right);

            root.right = deleteRec(root.right, root.val);
        }

        return root;
    }

    int minValue(TreeNode root) {
        int minValue = root.val;
        while (root.left != null) {
            minValue = root.left.val;
            root = root.left;
        }
        return minValue;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Search for 20: " + bst.search(20)); // true
        System.out.println("Search for 10: " + bst.search(10)); // false

        bst.delete(20);
        System.out.println("Search for 20 after deletion: " + bst.search(20)); // false
    }
}
