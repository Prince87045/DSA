public class Transpose {
    public static void printTranspose(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int transpose[][]=new int [m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printArr(transpose);
    }    
        public static void printArr(int matrix[][]){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printTranspose(matrix);
    }
}
