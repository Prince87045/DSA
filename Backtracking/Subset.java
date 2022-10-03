public class Subset {
    public static void printSubset(String str,int i,String subset){
        //Base case
        if(i==str.length()){
            System.out.println(subset);
            return;
        }
        //Recursion
        //Yes choice
        printSubset(str, i+1, subset+str.charAt(i));
        //No choice
        printSubset(str, i+1, subset);
    }
    public static void main(String[] args) {
        String str="abc";
        printSubset(str, 0, "");
    }
}
