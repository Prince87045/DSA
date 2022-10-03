//Pair each element of Array A with Array B such that the sum of absolute difference of all pairs is minimum
import java.util.*;
public class MinSumAbsDiff {
    public static void main(String[] args) {
        int A[]={4,8,1,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Min absolute diff is "+minDiff); 
    }
}
