public class Main {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
    }

    public static String tripleTrouble(String one, String two, String three) {
        String output = "";
        for (int i = 0; i < one.length(); i++){
            output = output + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return output;
    }
}
