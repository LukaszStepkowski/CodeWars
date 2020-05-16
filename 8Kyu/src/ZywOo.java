public class ZywOo {
    public static int[] take(int[] arr, int n) {
        int[] output;
        if (n > arr.length){
            output = new int[arr.length];
        } else {
            output = new int[n];
        }
        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i];
        }
        return output;
    }
}
