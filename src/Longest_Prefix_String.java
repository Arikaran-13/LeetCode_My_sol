import java.util.ArrayList;
import java.util.Comparator;

public class Longest_Prefix_String {
    public static String longestPrefix(String[]arr){
        ArrayList<String>al = new ArrayList<>();

        for(int i=1;i<arr.length;i++){
            String temp1 = arr[i-1];
            String temp2 = arr[i];
            int len = Math.min(temp1.length(),temp2.length());
            String prefix="";
            for(int j=0;j<len;j++){
                if(temp1.charAt(j)==temp2.charAt(j)){
                    prefix += temp1.charAt(j);

                }
                else{
                    al.add(" ");
                    al.add(prefix);
                    break;
                }
            }
        }
        return al.stream().max(Comparator.comparingInt(String::length)).get();
    }
    public static void main(String[]args){
        String[]arr = {"dog","racecar","car"};
        System.out.println(longestPrefix(arr));
    }
}
