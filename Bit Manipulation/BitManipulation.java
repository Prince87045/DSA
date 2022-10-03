
public class BitManipulation {

    public static void oddOrEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){//if LSB(n & 1) is 0 then even 
            System.out.println("even number");
        }else{
            System.out.println("odd number"); //LSB=1 then odd 
        }
    }

    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){//if the ith bit is 0 update it to 1
        int bitmask=1<<i;
        return (n|bitmask);
    }

    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return (n & bitmask);
    }

    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n,i);
        }else{
            return setIthBit(n,i);
        }

    }
    public static int clearLastIthBits(int n,int i){
        int bitmask=(~0)<<i;
        return (n & bitmask);

    }
    public static void main(String[] args) {
        oddOrEven(12);
        oddOrEven(11);

        int index=getIthBit(12,3); //12=1100 i=3 3rd index bit=1
        System.out.println(index);

        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,1,1));
        System.out.println(clearLastIthBits(15,2));
    }
}
