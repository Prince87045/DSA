//Find factorial of a number
import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println("The factorial of a number is: "+result);
    }
}
