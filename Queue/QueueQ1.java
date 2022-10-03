//implement queue using Linked List
public class QueueQ1 {

    static class Node{
        int data;
        Node next;

        Node(int data){//Node constructor
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head == null & tail ==null;
        }

        //add
        public static void add(int data){
            Node newNode =new Node(data);           
            if(head == null){//adding node in an empty list
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front=head.data;
            //single element
            if(head == tail){
                head =tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(7);

        //printing queue
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
