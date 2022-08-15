import java.util.HashSet;

public class Longest_nonRepeatingCharacter_subtring {
    public static int ans(String str) {
        HashSet<Character> hs = new HashSet<>();
        int n = str.length(), i = 0, start = 0, maxSize = 0;
        while (i < n) {


            if (!hs.contains(str.charAt(i))) {
                hs.add(str.charAt(i));
                if (maxSize < hs.size()) {
                    maxSize = hs.size();
                }
                i++;
            } else {
                hs.remove(str.charAt(start));
                start++;
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";

        int ans = ans(str);
        System.out.println(ans);
    }
}
