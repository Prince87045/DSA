/*buuterfly pattern
 lines----->> star + space + star
            (i)times +(2*n-2) +(i)times
 *      *
 **    **
 ***  ***
 ******** 
 ********
 ***  ***
 **    **
 *      *

 */
public class ButterflyPattern {
   
    public static void main(String[] args) {
        int n=4;//rows
        //outer loop for upward half pattern
        for(int i=1;i<=n;i++){
            //inner loop for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //inner loop for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // outer loop for down half pattern
        for(int i=n;i>=1;i--){
            //inner loop for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //inner loop for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
