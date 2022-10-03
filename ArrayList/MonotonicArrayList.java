//check whether a list is either monotonic increasing or decreasing
//example---> monotonic [2 3 3 4],[6 5 4 4]
//non monotonic [6 5 4 4]

import java.util.ArrayList;
public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }

        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(8);
        System.out.println(isMonotonic(list));        
    }
}
