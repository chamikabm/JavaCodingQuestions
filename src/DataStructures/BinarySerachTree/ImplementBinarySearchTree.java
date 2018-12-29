package DataStructures.BinarySerachTree;

/**
 * Program: Implement Binary Search Tree (BST)
 *
 * Link : http://www.java2novice.com/java-interview-programs/implement-binary-search-tree-bst/
 *
 * For a binary tree to be a binary search tree (BST), the data of all the nodes in the left sub-tree of the
 * root node should be less than or equals to the data of the root. The data of all the nodes in the right
 * subtree of the root node should be greater than the data of the root.
 *
 *
 */
public class ImplementBinarySearchTree {

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

    public static void main(String a[]) {

        ImplementBinarySearchTree bst = new ImplementBinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
    }

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
}
