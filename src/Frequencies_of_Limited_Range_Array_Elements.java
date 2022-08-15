import java.util.*;

public class Frequencies_of_Limited_Range_Array_Elements {

    public static void freqCount(int[] arr, int n, int p) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            hm.put(i, 0);
        }

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]) && arr[i] <= p) {

                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> ans = hm.entrySet();
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> i : ans) {
            arr[k++] = i.getValue();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int n = arr.length;
        int p = 5;
        freqCount(arr, n, p);
    }
}


