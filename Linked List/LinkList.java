//Remove Nth node from the end
//(N)th end=(size-n+1)th Start 
public class LinkList {
    public static class Node{
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

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        return;
    }

    public void removeNthEndNode(int n){
        if(n==size){
            head=head.next; //remove first
            size--;
            return;
        }
        int i=1;
        Node prev=head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        //i=size-n prev node
        prev.next=prev.next.next;
        size--;
        return;
    }
    //slow fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my midnode
    }

    public boolean isPalindrome(){
        //step1-find middle Node
        Node midNode=findMid(head);

        //step2-reverse the 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; //right half head
        Node left=head;

        //step3-check if right half equal to left half
        while(right != null){
              if(right.data != left.data){
                return false;
              }   
              right=right.next;
              left=left.next;                    
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2

            if(slow==fast){
                return true; //cycle exists
            }
        }
        return false;  //cycle does not exists
    }
    
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null;
        while(slow != fast){
            prev=fast; //last node
            slow=slow.next;
            fast=fast.next;
        }

        //removing cycle
        prev.next=null;
    }
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
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
      LinkList ll=new LinkList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(5);
        ll.print();
        System.out.println(LinkList.size);

        //remove nth node from end and print size and linked list
        ll.removeNthEndNode(1);
        ll.print();
        System.out.println(LinkList.size);

        System.out.println(ll.isPalindrome());
        head.next.next=head.next;
        //ll.print(); will go in infinite loop
         System.out.println(isCycle()); //detect a cycle

         removeCycle();
         System.out.println(isCycle());
    }
}
