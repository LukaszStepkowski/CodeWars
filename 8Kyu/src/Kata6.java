public class Kata6 {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++){
            if (i % 2 == 0){
                sb.append("1");
            } else sb.append("0");
        }
        return sb.toString();
    }
}
