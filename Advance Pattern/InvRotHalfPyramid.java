/*Pattern

     *
    **
   ***
  ****

 */

public class InvRotHalfPyramid {
    public static void main(String[] args) {
        int spc=3;
        int str=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            System.out.println();
            str++;
            spc--;
        }
    }
}
