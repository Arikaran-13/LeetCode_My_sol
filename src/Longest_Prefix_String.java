import java.util.ArrayList;
import java.util.Comparator;

public class Longest_Prefix_String {
    public static String longestPrefix(String[]arr){

        if(arr.length==0) return "";
        String prefix  = arr[0];

      for(int i=1;i<arr.length;i++){
          while(arr[i].indexOf(prefix)!=0){
              prefix = prefix.substring(0,prefix.length()-1);
          }

      }
      return prefix;


    }
    public static void main(String[]args){
        String[]arr = {"flower","flow","flag"};
        System.out.println();
        System.out.println(longestPrefix(arr));
    }
}
