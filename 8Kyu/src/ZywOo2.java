public class ZywOo2 {
    public static boolean validateUsr(String s) {
        return (s.matches("[a-z0-9_]{4,16}")) ? true : false;
    }
}
