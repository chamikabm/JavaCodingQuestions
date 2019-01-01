package DataStructures.BinarySerachTree;

/**
 * Program: Find min and max value from Binary Search Tree (BST)
 *
 * Link : http://www.java2novice.com/java-interview-programs/min-max-value-from-binary-search-tree-bst/
 *
 * Description:
 * For a binary tree to be a binary search tree (BST), the data of all the nodes in the left sub-tree
 * of the root node should be less than or equals to the data of the root. The data of all the nodes in the
 * right subtree of the root node should be greater than the data of the root.
 * This example shows how to find min & max value of a binary search tree.
 *
 *
 */
public class FindMinAndMaxInBST {

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

    public Integer findMinValue() {

        return minValue(this.root);
    }

    public Integer findMaxValue() {

        return maxValue(this.root);
    }

    private Integer minValue(BstNode node) {

        if(node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getData();
    }

    private Integer maxValue(BstNode node) {

        if(node.getRight() != null) {
            return maxValue(node.getRight());
        }
        return node.getData();
    }

    public static void main(String a[]) {

        FindMinAndMaxInBST bst = new FindMinAndMaxInBST();
        bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
        bst.insert(2);
        System.out.println("-------------------");
        System.out.println("Min value: "+bst.findMinValue());
        System.out.println("Max value: "+bst.findMaxValue());
    }
}
