package DataStructures.BinarySerachTree;

/**
 * Program: Implement Binary Search Tree (BST) pre-order traversal (depth first).
 *
 * Link : http://www.java2novice.com/java-interview-programs/pre-order-traversal-binary-search-tree-bst/
 *
 * Description:
 * For a binary tree to be a binary search tree (BST), the data of all the nodes in the
 * left sub-tree of the root node should be less than or equals to the data of the root.
 * The data of all the nodes in the right subtree of the root node should be greater than the data of the root.
 * This example shows the implementation of a binary search tree pre-order traversal (depth first).
 *
 *
 */
public class BSTPreOrderDepthFirstTraversal {

    private class BstNode {

        private BstNode left;
        private BstNode right;
        private Integer data;

        public BstNode(Integer data) {
            this.data = data;
        }

        public BstNode getLeft() {
            return left;
        }
        public void setLeft(BstNode left) {
            this.left = left;
        }
        public BstNode getRight() {
            return right;
        }
        public void setRight(BstNode right) {
            this.right = right;
        }

        public Integer getData() {
            return data;
        }
    }

    private BstNode root;

    public boolean isEmpty() {

        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: "+data+"]");
        if(root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: "+data);
            return;
        }

        insertNode(this.root, data);
        System.out.print(" -> inserted: "+data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->"+root.getData());
        if(root.getData() >= data) {
            System.out.print(" [L]");
            if(root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if(root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }

        return insertNode(tmpNode, data);
    }

    public void preOrderTraversal() {
        doPreOrder(this.root);
    }

    private void doPreOrder(BstNode root) {

        if(root == null) return;
        System.out.print(root.getData()+" ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }

    public static void main(String a[]) {

        BSTPreOrderDepthFirstTraversal bst = new BSTPreOrderDepthFirstTraversal();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("\n-------------------");
        System.out.println("Pre Order Traversal");
        bst.preOrderTraversal();
    }
}
