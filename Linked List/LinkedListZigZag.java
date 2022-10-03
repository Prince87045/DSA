//For a linkedList of the form L(1)->L(2)->L(3)->......L(n-1)->L(n) 
//convert it into              L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2).....

public class LinkedListZigZag {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void zigzag(){
        //find middle
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //2nd half reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left =head;
        Node right=prev;
        Node nextL,nextR;
        //alternate merging
        while(left != null && right != null){
            nextL=left.next;       //4 steps for zigzag
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //update
            left=nextL;
            right=nextR;
        }

    }

    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListZigZag ll=new LinkedListZigZag();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        //printing LinkedList
        ll.print();
        ll.zigzag();
        ll.print();
        
    }
    
}
