//perform basic operations of PriorityQueue
//Compare Objects of Classes

import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicsOperations {
    static class Student implements Comparable <Student> {//Overriding
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override  //compare student class objects on the basis of their rank
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(8);
        pq.add(3);
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();

        PriorityQueue<Student> st=new PriorityQueue<>();
        st.add(new Student("a",50));
        st.add(new Student("b",5));
        st.add(new Student("c",20));
        st.add(new Student("d",2));

        while(!st.isEmpty()){
            System.out.println(st.peek().name+" ->"+st.peek().rank);
            st.remove();
        }
    }
}
