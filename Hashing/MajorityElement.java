//Given an integer array of size n find all the elements that appear >= (n/3) size
import java.util.Set;
import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1,2,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);  //update
            } else {
                map.put(num,1);  //key occuring first time
            }
        }

        Set<Integer> keyset=map.keySet();
        for(Integer key : keyset){
            if(map.get(key)>=arr.length/3){
                System.out.println("key="+key+",value="+map.get(key));
            }
        }

    }
}
