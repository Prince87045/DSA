import java.util.ArrayList;
public class PairSum2 {
    public static boolean pairSumOpt(ArrayList<Integer> list, int target){
        int n=list.size();
        int bp=-1;
        //for finding the lp and rp
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){//breaking pt
                bp=i;
                break;
            }
        } 
        int lp=bp+1;//Left pointer (Smallest value)
        int rp=bp; //Right pointer (Largest value)     
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(rp-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSumOpt(list, 18));
    }
}
