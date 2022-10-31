/*Find length of largest subarray with sum 0
  for ex {15,2,-2,-8,1,7,10}
    subarray with sum 0 are {2,-2},{-8,1,7},{2,-2,-8,1,7}
*/
import java.util.*;
public class LargestSubarray {
    public static void main(String[] args) {
        int nums[]={15,2,-2,-8,1,7,10};
        HashMap<Integer,Integer> set=new HashMap<>();
        //(sum,idx)
        int sum=0;
        int length=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(set.containsKey(sum)){
                length=Math.max(length,j-set.get(sum));
            } else {
                set.put(sum,j);
            }
        }
        System.out.println("largest subarray with sum 0 is "+length);
    }
}
