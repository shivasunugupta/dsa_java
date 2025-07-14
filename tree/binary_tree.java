import java.util.*;

public class binary_tree
{
    static class Node
    {
        Node left, right;
        int data;

        public Node(int data)
        {
            this.data = data;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static Node createTree()
    {
        Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if (data == -1)
        {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left child for " + data);
        root.left = createTree();

        System.out.println("Enter right child for " + data);
        root.right = createTree();

        return root;
    }

    static void preOrder(Node root)
    {
        if (root == null)
            return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root)
    {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root)
    {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter elements to create a binary tree. Enter -1 to indicate a null node.");
        Node root = createTree();

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();


        System.out.println("Binary Tree created successfully!");
    }

}
