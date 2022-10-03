//prepare Length Chain of Pairs
import java.util.*;
public class MaxLengthChain {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        //select first pair
        int length=1;
        int chainEnd=pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                length++;
                chainEnd=pairs[i][1]; //update chain end
            }
        }
        System.out.println("max chain length is "+length);
    }
}
