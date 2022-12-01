package cnJava.Tree;

import java.util.Scanner;

public class TreeUse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(scan);
        print(root);
//
//        TreeNode<Integer> root = new TreeNode<>(5);
//        TreeNode<Integer> node1 = new TreeNode<>(4);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(2);
//        TreeNode<Integer> node4 = new TreeNode<>(1);
//        root.ChildNode.add(node1);
//        root.ChildNode.add(node2);
//        root.ChildNode.add(node3);
//        node2.ChildNode.add(node4);
//        System.out.println(root);
    }

    private static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.ChildNode.size(); i++) {
            s = s + root.ChildNode.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.ChildNode.size(); i++) {
            print(root.ChildNode.get(i));
        }
    }

    public static TreeNode<Integer> takeInput(Scanner scan) {
        int n;
//        Scanner scan = new Scanner(System.in);
        System.out.println("Enter root");
        n = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("enter no of child" + n);
        int childcount = scan.nextInt();
        for (int i = 0; i < childcount; i++) {
            TreeNode<Integer> child = takeInput(scan);
            root.ChildNode.add(child);
        }
        return root;
    }

}
