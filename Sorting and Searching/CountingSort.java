//date-19/8/22
public class CountingSort {
    public static void CountSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        //Declairing Count Array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }

        //Printing Array
        public static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    
    public static void main(String[] args) {
        int arr[]={5,72,9,1,30,6};
        CountSort(arr);
    }
    
}
