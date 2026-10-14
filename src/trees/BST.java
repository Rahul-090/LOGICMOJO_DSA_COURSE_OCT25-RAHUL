package trees;

import com.sun.source.tree.Tree;

public class BST {

    TreeNode root;

    //insert in BST
    public static TreeNode insertionInBST(TreeNode root, int val) {
        TreeNode newTreeNode = new TreeNode(val);
        if (root == null) {
            root = newTreeNode;
            return root;
        }
        if (newTreeNode.val < root.val) {
            root.left = insertionInBST(root.left, val);
        } else {
            root.right = insertionInBST(root.right, val);
        }
        return root;
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        System.out.print(root.val + " ");
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Insertion: ");

        TreeNode root = new TreeNode(4);

        insertionInBST(root, 2);
        insertionInBST(root, 5);
        System.out.print("PreOrder Traversal: ");
        preOrderTraversal(root);
    }
}
