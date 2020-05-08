public class Main {
    public static void main(String[] args) {

    }

    public static boolean check(Object[] a, Object x) {

        for (Object object : a) {
            if (x.equals(object)) {
                return true;
            }
        }
        return false;
    }
}
