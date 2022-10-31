//Hashset,LinkedHashSet,TreeSet 
import java.util.*;
public class Set {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Bengaluru");
        System.out.println(hs);  //random order

        LinkedHashSet<String> lhs=new LinkedHashSet<>(); 
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);  //order  of insertion 

        TreeSet<String> tm=new TreeSet<>();
        tm.add("Delhi");
        tm.add("Mumbai");
        tm.add("Noida");
        tm.add("Bengaluru");
        System.out.println(tm);  //sorted in ascending order
    }
}
