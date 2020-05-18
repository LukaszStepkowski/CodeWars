public class SmallestIntegerFinder {
    public static void main(String[] args) {

    }

    public static int findSmallestInt(int[] args) {
        int opt = args[0];
        for (int i = 0; i < args.length; i++){
            if (opt > args[i]){
                opt = args[i];
            }
        }
        return opt;
    }
}
