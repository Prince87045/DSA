import java.util.Scanner;
//Conversion of binary to decimal
// example---> 10110=16+2+4=22

public class BinaryToDec{
    public static void bintodec(int binNum){
        int lastdigit=1;
        int decNum=0;
        int pow=0;
        int myNum=binNum;
        while(binNum>0){
            lastdigit=binNum%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(myNum+"in decimal is "+decNum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary number");
        int binNum=sc.nextInt();
        bintodec(binNum);

    }
}