public class ChristmasPattern {
    public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2;j++){
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
