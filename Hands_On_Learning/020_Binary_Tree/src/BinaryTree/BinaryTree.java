package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    private static class Node{
        Node left;
        Node right;
        int value;
        public Node(int value){
            this.value = value;
        }
    }
    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter on left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter on right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String prefix, boolean isTail) {
        if (node == null) {
            return;
        }

        // Print right child first
        if (node.right != null) {
            printTree(node.right, prefix + (isTail ? "│   " : "    "), false);
        }

        // Print current node
        System.out.println(prefix + (isTail ? "└── " : "┌── ") + node.value);

        // Print left child last
        if (node.left != null) {
            printTree(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }


}
