import java.util.Arrays;

class Rotate_Aray {
    public static void rotate(int[] arr, int k) {
        int temp = 0;
        while (k-- > 0) {

            temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {

                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = temp;

        }
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;

        rotate(arr, k);
    }
}