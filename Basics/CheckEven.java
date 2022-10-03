import java.util.Scanner;
public class CheckEven {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(isEven(n)){
            System.out.println(n+" is an even number");
        }else{
            System.out.println(n+" is an odd number");
        }
    }
}
