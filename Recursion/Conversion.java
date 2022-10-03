//Convert a Number to String 1249---->"one two four nine"
public class Conversion {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void numToString(int num){
        //Base Condition
        if(num==0){
            return;
        }
       
        int lastDigit=num%10;
        numToString(num/10);
        System.out.print(digits[lastDigit]+" ");
        }
    public static void main(String[] args) {
        int num=1249;
        numToString(num);
    }
}
