//Find all the permutation of a String
public class Permutation {
    public static void findPermutation(String str,String newStr){
        //Base Case
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }

        //Recrsion kaam
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //abcde---->"ab"+"de"
            String newstr=str.substring(0,i)+str.substring(i+1);
            findPermutation(newstr, newStr+currChar);           
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str, "");
    }
}
