//Print Nth fibonnaci term of the series
// Series----> 0 1 1 2 3 5 8 13 21.....
//Index -----> 0 1 2 3 4 5 6  7  8.....

public class FibonacciTerm {
    public static int fib(int n){
        if(n==0 || n==1){//Base Condition 
            return n;
        }

        //2 recursive calls 
        fib(n-1);
        fib(n-2);
        int fibn=fib(n-1)+fib(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        int result=fib(8);
        System.out.println(result);
    }
}
