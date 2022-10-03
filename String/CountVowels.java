//count lower case vowels in a string
//example "prince mehta"=4

public class CountVowels {
    public static int countLowercaseVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Prince Mehta";       
        System.out.println(countLowercaseVowels(str));
    }
    
}
