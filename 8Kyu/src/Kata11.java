public class Kata11 {
    public static int[] pipeFix(int[] numbers) {
        int opt[] = new int[(numbers[numbers.length - 1]) - numbers[0] + 1];
        for (int i = 0; i < opt.length; i++){
            opt[i] = numbers[0] + i;
        }
        return opt;
    }
}
