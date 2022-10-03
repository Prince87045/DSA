public class ReverseArray {
    public static void reverseArray(int numbers[]){
        int first=0;
        int last=numbers.length-1;
            while(first<last){
                //swapping
                int temp=numbers[first];
                numbers[first]=numbers[last];
                numbers[last]=temp;

                first++;
                last--;
            }
    }
    public static void main(String[] args) {
        int numbers[]={5,7,10,12,65,7};
        reverseArray(numbers);

        //Printing arrays
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
