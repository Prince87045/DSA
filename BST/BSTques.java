//print root to leaf path
//check if a tree is a valid BST or not
//print mirror image of a BST
import java.util.*;
public class BSTques {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.data);
        if(root.left == null && root.right == null){
            for(int i=0;i<path.size();i++){  //print path at leaf node 
                System.out.print(path.get(i)+"->");
            }
            System.out.println("null");
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static boolean isValid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){ 
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root)&&
               isValid(root.right,root, max);
    }

    public static Node printMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror=printMirror(root.left);
        Node rightMirror=printMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*  BST                                Mirror image      
             8                                  8
            / \                                / \                 
           5  10                              10  5      preorder--> 8 10 11 14 5 6 3 
          / \   \                             /  / \
         3   6   11                          11  6  3
                  \                          /
                  14                        14

         */
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

        ArrayList<Integer> path=new ArrayList<>();
        printRoot2Leaf(root, path);
        
        //if valid bst print yes valid BST otherwise no
        //take 9 instead of 6 to check 
        if(isValid(root, null, null)){
            System.out.println("valid BST");
        }else {
            System.out.println("BST not valid");
        }

        //print mirror image of a tree 
        root=printMirror(root);
        preorder(root);
    }
}
