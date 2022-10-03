public class QuickSort {

    public static void quicksort(int arr[],int si,int ei){

        //Base Condition
        if(si>=ei){
            return;
        }
        //last element
        int pIdx=partition(arr,si,ei);
        quicksort(arr,si,pIdx-1);//left 
        quicksort(arr, pIdx+1, ei);//right 
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //iterator making the space for the elements smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){//compairing with the pivot
                //Swap
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }       
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,5,3,8,3,9};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
