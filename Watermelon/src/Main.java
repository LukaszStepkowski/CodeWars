public class Main {
    public static void main(String[] args) {

    }

    public static boolean divide(int weight) {
        if (weight / 2 <= 1){
            return false;
        } else if (weight % 2 == 0){
            return true;
        }
        return false;
    }
}
