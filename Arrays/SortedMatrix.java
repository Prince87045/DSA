public class SortedMatrix {
    public static void staircase(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;

        while(row>=0 && col<=matrix[0].length-1){
            if(matrix[row][col]==key){
                System.out.print(key+" found at index ("+row+","+col+")");
                return;
            }else if(key>matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("key not found in matrix!");
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        staircase(matrix,30);
    }
}
