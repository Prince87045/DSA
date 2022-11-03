import java.util.*;
public class InsertInHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public static void add(int data){
            //add at last index
            arr.add(data);

            //fix heap
            int x=arr.size()-1; //x is child index
            int par=(x-1)/2;  //parent index

            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        
        
    }
}
