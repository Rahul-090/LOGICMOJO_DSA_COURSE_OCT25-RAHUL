package trees;

import sun.reflect.generics.tree.Tree;

public class DeleteBSTNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        BST.insertionInBST(root, 3);
        BST.insertionInBST(root, 6);
        BST.insertionInBST(root, 2);
        BST.insertionInBST(root, 4);
        BST.insertionInBST(root, 7);

        BST.printTreeASCII(root);
        deleteNodeInBst(root, 3 );
        System.out.println("-----------------------");
        BST.printTreeASCII(root);

    }

    public static TreeNode deleteNodeInBst(TreeNode root, int key){
        if(root == null){
            return null;
        }
        TreeNode dummy = root;
        while(root != null){
            if(key < root.val){
                if(root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                }else{
                    root = root.left;
                }
            }else{
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                }else{
                    root = root.right;
                }
            }
        }

        return dummy;
    }

    public static TreeNode helper(TreeNode root){
         if(root.left == null){
             return root.right;
         }

         if(root.right == null){
             return root.left;
         }

         TreeNode rightNode = root.right;
         TreeNode leftNodesRightMostNode = leftNodesRightMostNode(root.left);
         leftNodesRightMostNode.right = rightNode;
         return root.left;
    }

    public static TreeNode leftNodesRightMostNode(TreeNode root){
        if(root.right == null){
            return root;
        }
        return leftNodesRightMostNode(root.right);
    }
}
