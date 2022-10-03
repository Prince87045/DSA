/*Pattern
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */

public class FloydsTriangle {
    public static void main(String[] args) {
            int num=1;
            //outer loops for rows
            for(int i=1;i<=5;i++){
                //inner loop for printing number
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }System.out.println();
            }
        }
    }
