public class Main {
    public static void main(String[] args) {

    }

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
