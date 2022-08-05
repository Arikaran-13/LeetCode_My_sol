import java.util.*;
import java.util.stream.Collectors;

public class Majority_Element_method2 {
    public static int majority(int [] arr , int n){

       HashMap<Integer,Integer>hm = new HashMap<>();
       for(int i=0;i<n;i++){
           if(!hm.containsKey(arr[i])){
               hm.put(arr[i],1);
           }
           else{
               hm.put(arr[i],hm.get(arr[i])+1);
           }
       }
       int ans=0;
       boolean f=true;
       Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
       for(Map.Entry<Integer,Integer> i : es){
           if(i.getValue() >= n/2){
               ans=i.getKey();
               f=false;
               break;
           }
       }
       if(f)return -1;
       return ans;
    }
    public static void main(String[]args){

        int [] arr= {3,1,3,3,2};
        int size=5;
        System.out.println(majority(arr, size));
    }
}
