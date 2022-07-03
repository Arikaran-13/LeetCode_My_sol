import java.math.BigInteger;
import java.util.stream.IntStream;

public class PalindromeNumber {
    public static Boolean isPalindrome(int n){
      String temp=String.valueOf(n);
      StringBuilder sb = new StringBuilder(temp);
      StringBuilder ans = sb.reverse();
      Integer k = Integer.valueOf(String.valueOf(ans));
      int k1=k;
        System.out.println(k);
        if(n==k1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
      int n  =121;
       Boolean b = isPalindrome(n);
        System.out.println(b);
    }
}
