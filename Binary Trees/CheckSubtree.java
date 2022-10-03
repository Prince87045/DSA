//Check if a given tree is a subtree of the another tree or not
public class CheckSubtree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){   //Constructor 
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static boolean isSubtree(Node root,Node subroot){
            //subroot not found in transversal
            if(root == null){ //reached to the leaf node
                return false;
            }

            if(root.data == subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return isSubtree(root.left,subroot) || isSubtree(root.right, subroot);
        }
        public static boolean isIdentical(Node node,Node subroot){
            if(node == null && subroot ==null){
                return true;
            }else if(node ==null || subroot == null || node.data != subroot.data){
                return false;
            }

            if(!isIdentical(node.left,subroot.left)){
                return false;
            }
            if(!isIdentical(node.right,subroot.right)){
                return false;
            }
            return true;
        }
    public static void main(String[] args) {
        /*
             1
            / \
           2   3
          / \   \
         4   5   6

         */

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        //root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        /*
             2
            / \
           4   5

         */

         Node subroot=new Node(2);
         subroot.left=new Node(4);
         subroot.right=new Node(5);

         System.out.println(isSubtree(root,subroot));
    }
}
