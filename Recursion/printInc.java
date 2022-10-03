//print number from 1 to n in increaing order
import java.util.*;
public class printInc {
    public static void printIncr(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();       
        printIncr(n);
    }
    
}
