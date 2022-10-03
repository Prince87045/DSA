//calculate the power of x----->x^n
public class Power {
    public static int pow(int x,int n){// TC--O(n)
        if(n==0){//Base Condition
            return 1;
        }
        pow(x,n-1);
        int xn=x*pow(x,n-1);
        return xn;
    }
    
    public static int powOpt(int x, int n){//optimised solution O(log n)

        if(n==0){//Base Condition
            return 1;
        }
        if(n%2==0){//if power is even x^n=(x^n/2)*(x^n/2)
            int xnb2=powOpt(x,n/2);
            int xn=xnb2*xnb2;
            return xn;
        }else{//if power is odd x^n=(x)*(x^n/2)*(x^n/2)
            int xnb2=powOpt(x,n/2);
            int xn=x*xnb2*xnb2;
            return xn;
        }
    }


    public static void main(String[] args) {
        int result=pow(5,4);
        System.out.println(result);
        System.out.println(powOpt(6, 3));
    }
}
