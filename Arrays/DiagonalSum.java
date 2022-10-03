public class DiagonalSum {
    /*public static int printDiagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){  not optimized O(n^2)
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    //Primary Diagonal
                    sum+=arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    */
    public static int printDiagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){  //optimized time complexity O(n)
            //Primary Diagonal
            sum+=arr[i][i];
                
            if(i!=arr.length-1-i)
                sum+=arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{2,3,5},{6,7,8},{9,10,11}};
        int sum=printDiagonalSum(arr);
        System.out.println("sum of primary and secondary diagonal is:"+sum);
    }
    
}
