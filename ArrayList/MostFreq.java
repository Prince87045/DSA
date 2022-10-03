import java.util.ArrayList;
public class MostFreq {
    public static int maxCount(ArrayList<Integer> nums,int key){
        for(int i=0;i<nums.size()-2;i++){
            if(nums.get(i)==key){
                int target=nums.get(i+1);               
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key=1;
        System.out.println(maxCount(nums,key));        
    }
}
