/*Pattern diamond
     *
    ***
   *****
  *******
   *******
    *****
     ***
      *

 */

public class Diamond {
    public static void main(String[] args) {
        int row=8;
        int spc=4;
        int str=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<row/2){
                str+=2;
                spc--;
            }else{
                str-=2;
                spc++;
            }
        }
    }
}
