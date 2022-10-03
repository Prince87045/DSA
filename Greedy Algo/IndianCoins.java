//This works only on Canonical coin system
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer denom[]={1,2,5,10,20,50,100,500,1000};
        Arrays.sort(denom,Comparator.reverseOrder());
        
        int count=0;
        int amt=3756;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<denom.length;i++){
            if(denom[i]<=amt){
                while(denom[i]<=amt){
                    count++;
                    ans.add(denom[i]);
                    amt-=denom[i];
                }
            }
        }
        System.out.println("total coins used is "+count);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
