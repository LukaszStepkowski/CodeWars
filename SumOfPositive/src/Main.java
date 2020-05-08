public class Main {
    public static void main(String[] args) {

    }

    public static int sum(int[] arr){

        int positiveSum = 0;

        for (int number : arr){
            if (number > 0){
                positiveSum += number;
            }
        }
        return positiveSum;
    }
}
