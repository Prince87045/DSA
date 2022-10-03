public class PrintPair {
    public static void printPair(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={3,10,20,7,47,8};
        printPair(numbers);
    }
}
