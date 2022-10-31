import java.util.*;
public class HashmapOperations{
    public static void main(String[] args) {
        //Create
        HashMap<String ,Integer> menu=new HashMap<>();

        //Insert O(1)
        menu.put("tea",10);
        menu.put("coeffee",50);
        menu.put("biryani",100);
        menu.put("chilly potato",100);

        System.out.println(menu);

        //get value (gives value of particular key)  O(1)
        System.out.println(menu.get("coeffee"));

        //contains key (returns boolean value)  O(1)
        System.out.println(menu.containsKey("momos"));//false
        System.out.println(menu.containsKey("biryani"));

        //remove any pair from hashmap   O(1)
        System.out.println(menu.remove("tea"));//remove and return value
        System.out.println(menu);

        //size
        System.out.println(menu.size());

        //is empty (returns boolean value)
        System.out.println(menu.isEmpty());

        /*
        clear (will empty the whole map)
        menu.clear();
        System.out.println(menu);
        System.out.println(menu.size());
        */

        //iterate
        Set<String> keys=menu.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key="+k+",values="+menu.get(k));
        }
    }
}