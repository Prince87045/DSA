/*Given an integer array nums, return true if any value
 appears at least twice in the array, 
and return false if every element is distinct
 */


public class checksDuplicate {
    public static boolean checkDuplicate(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numb1[]={1,2,3,1};
        int numb2[]={1,2,4,3};
        int numb3[]={1,1,1,3,3,4,3,2};

        boolean val1=checkDuplicate(numb1);
        boolean val2=checkDuplicate(numb2);
        boolean val3=checkDuplicate(numb3);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
}
