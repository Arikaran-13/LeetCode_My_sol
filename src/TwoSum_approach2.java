import java.util.HashMap;

public class TwoSum_approach2 {
    public static int[] twoSum(int[]arr,int k){

        HashMap<Integer,Integer>hm = new HashMap();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            int elem = k - arr[i];
            if (hm.containsKey(elem) && hm.get(elem)!=i){
                return new int[]{i,hm.get(elem)};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[]arr ={3,2,4};

        int target=6;
        int[]ans = twoSum(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
