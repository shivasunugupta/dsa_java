import javax.naming.InvalidNameException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    static Scanner sc = new Scanner(System.in);
    static TreeNode createTree(){
        System.out.println("Enter the data of the node or press -1 for null");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        TreeNode node = new TreeNode (data);
        System.out.println("Enter the data of left child for " +data);
        node .left = createTree();
        System.out.println("Enter the data of right child for " +data);
        node .right = createTree();

        return node;   //root node
    }

    static void formatedTree(TreeNode root, String prefix, boolean isLeft) {
        if (root == null) {
            return;
        }

        System.out.println(prefix + (isLeft ? "|--- " : "\\--- ") + root.data);

        // Recurse left and right
        formatedTree(root.left, prefix + (isLeft ? "|    " : "     "), true);
        formatedTree(root.right, prefix + (isLeft ? "|    " : "     "), false);
    }

    static void printTree(TreeNode root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    static void preOrder(binary_tree.Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(binary_tree.Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(binary_tree.Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static void levelOrder(TreeNode root){
        if(root == null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.println(currentNode.data);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {

        //iterative approach
//        TreeNode root = new TreeNode(10);
//        TreeNode leftChild = new TreeNode(20);
//        TreeNode rightChild = new TreeNode(30);

        //recursive approach
        TreeNode root = createTree();
        printTree(root);
        formatedTree(root,"",true);


    }
}
