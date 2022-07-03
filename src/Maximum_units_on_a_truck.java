import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Maximum_units_on_a_truck  {
    public static int maximumUnits(int[][]arr,int ts){
        Arrays.parallelSort(arr, Comparator.comparingInt(i->-i[1]));
        int k=0;
        int unitsadded=0;
      for(int i=0;i<arr.length;i++){
          int[]temp=arr[i]; //3,6

          int box=temp[0];
          int units=temp[1];
          k=ts;
          ts -= box;
          if(ts<0){
              unitsadded += k*units;
              break;
          }
          else {
              unitsadded += box * units;//18+8
          }
      }
    return unitsadded;
    }

    public static void main(String[]args){

        int[][]arr = {{1,3},{2,2},{3,1}};
        int trucksize=4;
        int ans = maximumUnits(arr, trucksize);
        System.out.println(ans);

        }

}


