import java.util.HashMap;

public class Romen_Integers {
    public static int romanToInt(String str){
       //char[]ch = str.toCharArray();
       HashMap<Character,Integer> hm = new HashMap<>();
       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000);
       int res = hm.get(str.charAt(str.length()-1));
       for(int i=str.length()-2;i>=0;i--){

           int curr = hm.get(str.charAt(i));
           int nxt = hm.get(str.charAt(i+1));
           if(hm.get(str.charAt(i))<hm.get(str.charAt(i+1))){
               res= res-hm.get(str.charAt(i));
           }
           else{
               res = res+hm.get(str.charAt(i));
           }
       }
       return res;


    }
    public static void main(String[]args){
        String str = "MCMXCIV";
        System.out.println( romanToInt(str));
    }
}
