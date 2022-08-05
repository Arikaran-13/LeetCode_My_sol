import java.util.*;
import java.util.stream.Collectors;

public class Majority_Element_method1 {
    public static int majority(int [] arr , int n){

     Map<Object,Long> hm =    Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        Set<Map.Entry<Object,Long>> en = hm.entrySet();
        int maj = n/2;
        int ans=0;
        boolean flag=true;
        for(Map.Entry<Object,Long> i : en){
            if(i.getValue() >= maj){

               ans= (Integer)i.getKey();
               flag=false;
                break;
            }

        }
        if(flag)return -1;
        else
        return ans;
    }
    public static void main(String[]args){

        int [] arr= {3,1,3,3,2};
        int size=5;
        System.out.println(majority(arr, size));
    }
}
