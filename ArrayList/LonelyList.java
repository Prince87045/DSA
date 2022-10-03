//A number x is lonely when it appears only once,and no adjacent numbers
//(i.e. x + 1 and x - 1) appear in the arraylist
//Input: nums = [10,6,5,8]
//Output: [10,8]

import java.util.ArrayList;
import java.util.Collections;
public class LonelyList {
    public static ArrayList<Integer> isLonely(ArrayList<Integer> nums){
       ArrayList<Integer> list=new ArrayList<>();
       Collections.sort(nums);
       for(int i=1;i<nums.size()-1;i++){//Check duplicacy of elements and other condn
            if((nums.get(i-1)+1<nums.get(i)) && (nums.get(i)+1)<(nums.get(i+1))){
                list.add(nums.get(i));
            }        
       } 
        //elements at index 0 and nums.size() are left and to be checked
        if(nums.size()==1){//for index 0
            list.add(nums.get(0));
        }   
        if(nums.size()>1){//for last index
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if((nums.get(nums.size()-2))+1<(nums.get(nums.size()-1))){
                list.add(nums.get(nums.size()-1));
            }
        }  
        return list; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.println(isLonely(nums));
    }
}
