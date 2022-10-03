//Check if an Array is Sorted or not
public class CheckSortedArry {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx+1]>=arr[idx]){
            return isSorted(arr,idx+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,9,12,30,4};
        int idx=0;
        boolean result=isSorted(arr,idx);
        System.out.println(result);
    }
}
