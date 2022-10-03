//print numbers in decreasing order from n to 1

import java.util.*;
public class PrintDec {
    public static void printDec(int n){
        //Base condition
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        printDec(n);
    }
}
