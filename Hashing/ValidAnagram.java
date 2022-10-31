import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch) != null){ //if key exist
                if(map.get(ch)==1){
                    map.remove(ch);
                } else {  //reduce freq by 1
                    map.put(ch,map.get(ch)-1);                
                }
            } else {  //key character doesnt exist 
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s="race";
        String t="caer";  
        System.out.println(isAnagram(s,t));      
    }
}
