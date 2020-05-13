public class Main {
    public static void main(String[] args) {
        System.out.println(isEven(-4));
    }

    public static boolean isEven(double n) {
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
}
