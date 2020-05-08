public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        System.out.println(arrayPlusArray(arr1, arr2));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;

        for (int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            sum += arr2[i];
        }

        return sum;
    }
}
