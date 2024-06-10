import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        Node tree = null;
        for (int i = 0; i < m; i++) {
            String command = sc.next();

            if (command.equals("insert")) {
                long key = sc.nextLong();
                if (tree == null) {
                    tree = new Node();
                    tree.value = key;
                } else {
                    tree.insert(key);
                }
            } else {
                if (tree != null) {
                    tree.printInOrder();
                    System.out.println();
                    tree.printPreOrder();
                    System.out.println();
                }
            }
        }
    }

    static class Node {
        long value;
        Node left;
        Node right;

        void insert(long newValue) {
            if (newValue < this.value) {
                if (left == null) {
                    left = new Node();
                    left.value = newValue;
                } else {
                    left.insert(newValue);
                }
            } else {
                if (right == null) {
                    right = new Node();
                    right.value = newValue;
                } else {
                    right.insert(newValue);
                }
            }
        }

        void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.print(" " + value);
            if (right != null) {
                right.printInOrder();
            }
        }

        void printPreOrder() {
            System.out.print(" " + value);
            if (left != null) {
                left.printPreOrder();
            }
            if (right != null) {
                right.printPreOrder();
            }
        }
    }
}

