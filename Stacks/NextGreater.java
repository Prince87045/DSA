import java.util.Arrays;
import java.util.Stack;
public class NextGreater {
    public static int[] nextGreat(int arr[]){
        int nextGreater[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){//traversing aray from back

            //1-while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){//remove smaller elements from Stack
                s.pop();
            }

            //2-if else
            if(s.isEmpty()) {
                nextGreater[i]=-1;
            } else {
                nextGreater[i]=arr[s.peek()];
            }

            //3-push into stack
            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        System.out.println(Arrays.toString(nextGreat(arr)));       
    }
}
