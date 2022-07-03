import java.math.BigInteger;
import java.util.stream.IntStream;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
      while(n>0){
          int rem = n%10;
          rev=rev*10+rem;;
          n=n/10;

      }
      if(rev==temp){
          return true;
      }
      else{
          return false;
      }

    }
    public static void main(String[] args) {
      int n  =123;
       boolean b = isPalindrome(n);
        System.out.println(b);
    }
}
