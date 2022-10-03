//print 2D ArrayList
//list1----->2 4 6 8 10
//list1----->3 6 9 12 15
//list1----->5 10 15 20 25
import java.util.ArrayList;
public class Multidimension {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();        
    
    for(int i=1;i<=5;i++){
        list1.add(i*2);
        list2.add(i*3);
        list3.add(i*5);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);

    //nested loops 
    for(int i=0;i<mainList.size();i++){
        ArrayList<Integer> currList=mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }
}
    
}

