import java.util.Arrays;
public class Anagram {
    public static void checkAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length()==str2.length()){
            char string1[]=str1.toCharArray();
            char string2[]=str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            boolean result=Arrays.equals(string1,string2);
            if(result){
                System.out.println(str1+" and "+str2+" are anagrams of each other");
            }else{
                System.out.println(str1+" and "+str2+" are not anagrams of each other");
            }
        }else{
            System.out.println(str1+" and "+str2+" are not anagrams of each other");
        }
    }
    public static void main(String[] args) {
        String str1="Below";
        String str2="Elbow";
        checkAnagram(str1,str2);
    }   
}
