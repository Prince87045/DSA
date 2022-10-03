/*LinkedList contains methods-
    add-     addFirst,addLast,add in the middle
    remove-  removeFirst,removeLast,
 size of LL,print LL
    iterative Search
    Reverse a Linked List
*/
public class LinkedList {
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
    
        public void addFirst(int data){
            //step1-create a new node
            Node newNode=new Node(data);
            size++;

            if(head==null){//if linked list is empty
                head=tail=newNode;
                return;
            }

            //step2 newNode next=head
            newNode.next=head;

            //head=newNode
            head=newNode;
        }

        public void addLast(int data){
            Node newNode=new Node(data);
            size++;

            if(head==null){//add node in an empty list
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public void add(int idx,int data){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            int i=0;
            Node temp=head;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            //i=idx-1 temp->prev
            newNode.next=temp.next;
            temp.next=newNode;
        }

        public int removeFirst(){
            if(size==0){
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }

        public int removeLast(){
            if(size==0){
                System.out.println("LinkedList is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            //prev : i=size-2
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            //int val=prev.next.data;  tail.data
            int val=tail.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }

        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){//key found
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //key not found
            return -1;
        }

        public void revList(){
            Node prev=null;
            Node curr=head;
            Node next;

            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public void print(){
            if(head==null){
              System.out.println("The linkedlist is empty");
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
        LinkedList ll=new LinkedList();
        ll.addFirst(2);     //add at the first
        ll.addFirst(1);
        ll.addLast(3);      //add at the last
        ll.addLast(4);
        ll.add(0,9);    //add at the middle(specific index)
        ll.print();
        System.out.println(LinkedList.size);

        System.out.print("first deleted node data is: ");
        System.out.println(ll.removeFirst());       
        ll.print();

        System.out.print("last deleted node data is: ");
        System.out.println(ll.removeLast());       
        ll.print();
        System.out.println("key found at index "+ll.itrSearch(1));

        ll.revList();//Reversing a LinkedList
        ll.print();
    }
}
