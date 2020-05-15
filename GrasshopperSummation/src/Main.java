public class Main {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }

    public static int summation(int n) {
        if (n == 0){
            return 0;
        } else return n + summation(n - 1);
    }
}
