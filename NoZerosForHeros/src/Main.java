public class Main {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(960000));
    }

    public static int noBoringZeros(int n) {
        for (int i = 0; i  < 10; i++){
            if (n % 10 == 0) {
                n = n / 10;
            }
        }
        return n;
    }
}
