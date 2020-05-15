public class Main {
    public static void main(String[] args) {

    }

    public static int nthPower(int[] array, int n) {
        if (n > array.length -1) {
            return -1;
        }

        return (int)Math.pow(array[n], n);
    }
}
