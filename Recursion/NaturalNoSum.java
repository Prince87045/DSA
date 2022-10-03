public class NaturalNoSum {
    public static int sum(int n){
        if(n==1){//base condn
            return 1;
        }
        sum(n-1);
        int sn=n+sum(n-1);
        return sn;
    }
    public static void main(String[] args) {
        int result=sum(12);
        System.out.println(result);
    }
}
