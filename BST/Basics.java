//build a BST when a array of a data is given 
//search an node/Key in a BST
public class Basics {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root ,int val){
        if(root == null){
            root=new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left=insert(root.left,val);
        } else {
            //right subtree 
            root.right=insert(root.right,val);
        }
       return root;
    }

    public static void inorder(Node root){
        if(root == null){//Base case 
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root == null){//if key not found from root to leaf node
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
        public static Node delete(Node root,int val){
            if(root.data>val){
                root.left=delete(root.left,val);
            } else if(root.data<val){
                root.right=delete(root.right,val);
            } else{  //if root.data =val voila
                //case 1 -leaf node 
                if(root.left == null && root.right ==null){
                    return null;
                }

                //case 2-Only one child 
                if(root.right == null){
                    return root.left;
                } else if(root.left ==null) {
                    return root.right;
                }

                //case 3- only two child 
                Node IS=findInorderSuccessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);
            }
            return root;
        }
            public static Node findInorderSuccessor(Node root){
                while(root.left != null){
                    root=root.left;
                }
                return root;
            }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        
        //inorder of a binary search tree gives sorted order
        inorder(root);
        System.out.println();

        //search a key in a BST
        if(search(root,5)){
            System.out.println("key found in tree");
        }else{
            System.out.println("key not found in tree");
        }

        root=delete(root,3);
        System.out.println();
        inorder(root);
    }
}
