public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.valueOf(herOld.replaceAll("\\D", ""));
    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }
}