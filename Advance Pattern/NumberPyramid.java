/*Pattern
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */
public class NumberPyramid {
    public static void main(String[] args) {
        int n=5;
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for print number
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
            
            
        }
    }
}
