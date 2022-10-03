//date=30/7/22
import java.util.*;
public class EvenNo {
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
