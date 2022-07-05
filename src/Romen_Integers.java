import java.util.HashMap;

public class Romen_Integers {
    public static int romanToInt(String str){
       char[]ch = str.toCharArray();
       HashMap<Character,Integer> hm = new HashMap<>();
       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000);
       int ans =0;
       for(char c : ch){
          ans+= hm.get(c);
       }
       return ans;
    }
    public static void main(String[]args){
        String str = "LVIII";
        System.out.println( romanToInt(str));
    }
}
