//count no of bits occuring bit '1'
//10----->1010 , no of setBits =2
public class CountSetBits {
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){//check our LSB
                count++;
            }
            n=n>>1;
        }
      return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));      
    }
}
