//calculate height of a tree
//count total nodes in a tree
//find sum of Nodes of a tree
//calculate diameter of a tree
//print Kth level of a tree 

public class BinTreeQuest {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static int height(Node root){   //O(n)
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int ht=Math.max(lh,rh)+1;
        return ht;
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int lcount=countNodes(root.left);
        int rcount=countNodes(root.right);
        int count=lcount+rcount+1;
        return count;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int lsum=sumOfNodes(root.left);
        int rsum=sumOfNodes(root.right);
        int treeSum=lsum+rsum+root.data;
        return treeSum;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int ldiam=diameter(root.left);
        int lht=height(root.left);
        int rdiam=diameter(root.right);
        int rht=height(root.right);

        int selfdiam=lht+rht+1;
        return Math.max(selfdiam,Math.max(ldiam,rdiam));
    }
    static class Info{
        int ht;
        int diam;

        Info(int diam, int ht){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static Info diameter2(Node root){

        if(root ==null){    //Base case
            return new Info(0,0);
        }

       //  LeftInfo and RightInfo will store ht and diameter both
       Info lfInfo=diameter2(root.left); 
       Info rtInfo=diameter2(root.right);

       int diam=Math.max(Math.max(lfInfo.diam,rtInfo.diam),lfInfo.ht+rtInfo.ht+1);
       int ht=Math.max(lfInfo.ht,rtInfo.ht)+1;

        return new Info(diam,ht);
    }

    public static void printKth(Node root,int level,int k){  
         //Recursive method
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        printKth(root.left,level+1,k);
        printKth(root.right,level+1,k);
    }
    public static void main(String[] args) {
        /*
                    1
                   / \         
                  2   3
                 / \   \
                4   5   6
               / \   \ / \
              n   n  n n   7

         
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.right.right=new Node(7);

        //height of tree
        System.out.println(height(root));
        //count nodes of a tree 
        System.out.println(countNodes(root));
        //Sum of nodes of a tree
        System.out.println(sumOfNodes(root));
        //Diameter of a tree
        System.out.println(diameter(root));
        //4 >2 >1 >3> 6 >7
        System.out.println(diameter2(root).diam); //O(n) Optimised approach
        //print kth level nodes of  a tree 
        printKth(root, 1, 1);
    }
}
