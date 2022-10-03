//Swapping idx1 and idx2 list elements
import java.util.ArrayList;
public class Swapping {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Print original list
        System.out.println(list);
        int idx1=2;
        int idx2=3;
        swap(list,idx1,idx2);
        //print swap list
        System.out.println(list);
    }
}
