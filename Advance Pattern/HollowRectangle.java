/*Pattern

   * * * * *
   *       *
   *       *
   *       *
   * * * * *

*/   
public class HollowRectangle {
    public static void main(String[] args) {
        int n=5;
        //outer loop for row
        for(int i=1;i<=n;i++){
            //inner loop for 
            for (int j=1;j<=5;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
