/*Pattern
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */

public class PatternZeroOne {
    public static void main(String[] args) {
        //outer loops for rows
        for(int i=1;i<=5;i++){
            //inner loop to print 0 and 1
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }System.out.println();
        }
    }
}
