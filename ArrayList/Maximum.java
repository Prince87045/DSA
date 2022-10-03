import java.util.ArrayList;
public class Maximum {
    public static int findMax(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }       
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(30);
        list.add(7);
        list.add(28);
        list.add(52);

        int result=findMax(list);
        System.out.println(result);
    }
}
