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

        public static int peek(){
            return arr.get(0);
        }

        /*private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size()-1 && ){}
        }
        public static int remove(){
            //Step 1 - swap first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,arr.get(0));

            //Step 2 - delete last
            arr.remove(arr.size()-1);

            //step 3- heapify

        }
        */
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
