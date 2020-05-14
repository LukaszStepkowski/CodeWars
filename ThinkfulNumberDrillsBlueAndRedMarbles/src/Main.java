public class Main {
    public static void main(String[] args) {
        System.out.println(guessBlue(5, 5, 2, 3));
    }

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        double blueLeft = blueStart - bluePulled;
        double redLeft = redStart - redPulled;

        return blueLeft / (blueLeft + redLeft);
    }
}
