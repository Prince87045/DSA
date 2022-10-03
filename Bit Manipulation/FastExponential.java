public class FastExponential {
    public static int fastExponential(int a,int n){
        int ans=1;
        while(n>0){
            if((n & 1) != 0){//check LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
       int result=fastExponential(5,4);
       System.out.println(result);
    }
}
