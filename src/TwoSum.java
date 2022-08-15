import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum { // On^2 approach
    public static int[] twoSum(int[]arr,int k){
   int[]ans = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==k){
                   ans[0]=i;
                   ans[1]=j;
                   break;
               }
            }
        }

        return ans;

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
