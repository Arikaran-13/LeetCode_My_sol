
import java.util.Arrays;

public class Alternate_positive_And_Negative_method1 {
    public static void reArrange(int[]arr,int n){
        int []pos=new int[n];
        int[]neg = new int[n];
        int po=0,ne=0;

        for(int i=0;i<n;i++){
            if(arr[i]>=0) pos[po++]=arr[i];
            else neg[ne++]=arr[i];
        }
        /*System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));*/
        int p=0,N=0,i=0;
        for( i=0;i<n;i++){
            if(p<po && N<ne){
                if(i%2==0) {
                    arr[i] = pos[p++];
                }
                else if(i%2!=0) {
                    arr[i] = neg[N++];
                }
            }
            else{
                break;
            }

        }
        while(p<po){
            arr[i++]=pos[p++];
        }
        while(N<ne){
            arr[i++]=neg[N++];
        }
      for(int k=0;k<n;k++){
          System.out.print(arr[k]+" ");
      }
    }
   public static void main(String[]args){
       int[]arr= {2,4,7,1,8,0,-5,-2,-8,-8};
       int n = arr.length;
       reArrange(arr,n);
   }
}
