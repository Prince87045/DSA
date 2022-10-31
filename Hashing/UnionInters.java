//count no of elements in union and intersection of 2 Arrays
import java.util.*;
public class UnionInters {
    public static void union(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Elements in union are "+set.size());
        System.out.println("Union is "+set);
    }

    public static void intersection(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Elements in intersection are "+count);
    }

    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        union(arr1,arr2);
        intersection(arr1,arr2);
    }
}
