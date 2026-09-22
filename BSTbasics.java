import java.util.*;
class Node{
    int val;
    Node right;
    Node left;

    Node(int val){
        this.val = val;
    }
}
public class BT1 {
    public static void main(String[] args) {
        //   3
        //  / \
        // 4   5
        // /\  /\
        //6  7 8 9
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);
        Node g = new Node(9);

        a.left = b; a.right = c;
        b.left = d ; b.right = e;
        c.left = f ; c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(maximum(a));



    }
    private static int maximum(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return  Math.max(root.val , Math.max(maximum(root.left), maximum(root.right));
    }
    private static int product(Node root){
        if(root == null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    private static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int size(Node root){
        if(root == null){
            return 0;
        }
        int leftsize = size(root.left);
        int rightsize = size(root.right);
        return 1 + leftsize + rightsize;
    }
    private static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
