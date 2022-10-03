//Container with most water
//calculate the maximum water (water=ht*width)
import java.util.ArrayList;
public class Container {
    public static int storeWater(ArrayList<Integer> height){
        int maxWat=0;
        //Brute force O(n^2)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWat=width*ht;
                maxWat=Math.max(currWat,maxWat);
            }           
        }
        return maxWat;
    }
    //2 pointer approach optimized way O(n)
    public static int storewater(ArrayList<Integer> height){
        int lp=0;
        int rp=height.size()-1;
        int maxWat=0;

        while(lp<rp){ //aftr this will get duplicate pairs
            
            //calculate area
            int width=rp-lp;
            int ht=Math.min(height.get(lp),height.get(rp));
            int currWat=width*ht;
            maxWat=Math.max(currWat,maxWat);

            //update pointer
            if(height.get(lp)<=height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWat;    
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
        System.out.println(storewater(height));
    }
}
