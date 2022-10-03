import java.util.*;
public class Table {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        System.out.println("Table of"+num+"is mentioned below");
        for(int i=0;i<=10;i++){
            int res=num*i;
            System.out.println(res);
        }
    }
    
}
