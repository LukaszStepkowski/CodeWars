public class Kata20 {
    public static int[] countPositivesSumNegatives(int[] input) {
        int countOfPositive = 0;
        int sumOfNegative = 0;
        int[] opt;
        if (input == null || input.length == 0){
            return opt = new int[0];
        } else {
            opt = new int[2];
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0){
                    countOfPositive++;
                } else sumOfNegative += input[i];
            }
        }
        opt[0] = countOfPositive;
        opt[1] = sumOfNegative;
        return opt;
    }
}
