public class Alternative_Positive_And_Negative_Method2 {
    public static void reArrange(int[]arr,int n){
        int misplace;
        for(int i=0;i<n;i++){
            if(i%2==0 && arr[i]<0){
                misplace=i;
            }
            if(arr[i]>0){

            }
        }

    }
    public static void main(String[] args) {
        int[]arr= {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;
        reArrange(arr,n);
    }
}
