//Find the first occurence of an element in an array
public class FirstLastOccur {
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,6,5,3};
        int key=5;
        int idx=firstOccurence(arr,key,0);
        System.out.println(idx);
    }
}
