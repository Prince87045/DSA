import java.util.Scanner;
//example----> 22=10110
public class DecToBin {
    public static void dectobin(int decNum){
        int pow=0;
        int binNum=0;
        int rem=0;
        int myNum=decNum;
        while(decNum>0){
            rem=decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println(myNum+"binary is "+binNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int decNum=sc.nextInt();
        dectobin(decNum);
    }
}
