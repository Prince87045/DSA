//error in code
import java.util.LinkedList;
public class Mergesort {
    public static Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1=head1.next;
                temp=temp.next;
            } else {
                temp.next = head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2 != null){
            temp.next =head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head){

        if(head == null || head.next == null){//Base case
            return head;
        }

        //find middle node
        Node mid = findMid(head);

        //left and right mergesort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
       LinkedList<Integer> ll=new LinkedList<Integer>();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);
       Mergesort.head=Mergesort.mergeSort(Mergesort.head);
       System.out.println(ll);
    }
}
